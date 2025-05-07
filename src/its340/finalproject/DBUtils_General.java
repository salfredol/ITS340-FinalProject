package its340.finalproject;
import java.awt.Component;
import java.awt.Container;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.LinkedList;
import java.util.Queue;

public class DBUtils_General 
{
    public static void writeInterviewLog(int pid, String patientName)
    {
        pid = GlobalData.patientID;
        patientName = GlobalData.patientName;
        
        try 
        {    
            File logDir = new File("logs");
            if (!logDir.exists()) 
            {
                logDir.mkdirs();
            }

            String timestamp = LocalDateTime.now().toString().replace(":", "-");
            String filename = "logs/interview_" + pid + "_" + timestamp + ".txt";
            FileWriter writer = new FileWriter(filename);

            writer.write("Patient Name: " + patientName + "\n");
            writer.write("Patient ID: " + pid + "\n");
            writer.write("Date: " + LocalDateTime.now().toString() + "\n");
            writer.write("------------------------------------------------------------\n");

            while (!Decision.logQueue.isEmpty()) 
            {
                writer.write(Decision.logQueue.poll() + "\n");
                writer.write("------------------------------------------------------------\n");
            }

            writer.close();
            System.out.println("Interview log saved to " + filename);
        } 
        catch (IOException e) 
        {
            System.out.println("Failed to write log file: " + e.getMessage());
        }
    }

    public static void toggleFormMode(Container root, boolean editMode) 
    {
        toggleComponents(root, editMode);

        updatePanelNav(root, editMode);
        updateFormLockButton(root, editMode);
    }

    private static void toggleComponents(Container container, boolean enabled) 
    {
        for (Component comp : container.getComponents()) 
        {
            if (comp instanceof Container) 
            {
                toggleComponents((Container) comp, enabled);
            }

            if (comp instanceof JButton && "btn_formlock".equals(comp.getName())) 
            {
                comp.setEnabled(true);
                continue;
            }

            comp.setEnabled(enabled);
        }
    }

    private static void updatePanelNav(Container container, boolean editMode) 
    {
           for (Component comp : container.getComponents()) 
           {
               if (comp instanceof JPanel && "panel_nav".equals(comp.getName())) 
               {
                   comp.setBackground(editMode ? new Color(0, 51, 102) : Color.GRAY);
               }

               if (comp instanceof Container) 
               {
                   updatePanelNav((Container) comp, editMode);
               }
           }
       }

       private static void updateFormLockButton(Container container, boolean editMode) 
       {
           for (Component comp : container.getComponents()) 
           {
               if (comp instanceof JButton && "btn_formlock".equals(comp.getName())) 
               {
                   ((JButton) comp).setText(editMode ? "EDIT MODE" : "VIEW MODE");
                   comp.setEnabled(true);
               }

               if (comp instanceof Container) 
               {
                   updateFormLockButton((Container) comp, editMode);
               }
           }
       }
   }

