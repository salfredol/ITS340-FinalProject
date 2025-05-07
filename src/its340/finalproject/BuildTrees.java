package its340.finalproject;

public class BuildTrees 
{
    public static void BuildAllInterviewQuestionSets()
    {
        //call other builds for all other questionsets
        GlobalData.BloodTypeQSet = BuildBloodTypeQSet();
        GlobalData.TobaccoQSet = BuildTobaccoQSet();
        GlobalData.AlcoholQSet = BuildAlcoholQSet();
        GlobalData.DrugQSet = BuildDrugQSet();
    }
    
    public static Decision BuildBloodTypeQSet()
    {
        Decision bloodTree = new Decision();
        bloodTree.createRoot(1, "You are about to be interviewed for your general medical history. "
                + "Is that ok?"); 
        
        //treeName.nodeType.(attach ID, node ID, "question");
        bloodTree.insertYesNode(1, 2, "Do you know your blood type?"); 
        bloodTree.insertNoNode(1, 3, "We understand, thank you for your time.");
        //DEAD END; go to next interview
        
        bloodTree.insertYesNode(2, 4, "Is your blood type O?");
        bloodTree.insertNoNode(2, 5, "We recommend consulting your healthcare provider to determine your blood type.");
        //DEAD END; go to next interview
        
        bloodTree.insertYesNode(4, 6, "Is your blood type O+?");
        bloodTree.insertNoNode(4, 9, "Is your blood type A?");
        
        bloodTree.insertYesNode(6, 7, "Your blood type has been recorded as O+.");
        bloodTree.insertNoNode(6, 8, "Your blood type has been recorded as O-.");
        //DEAD END; go to next interview
        
        bloodTree.insertYesNode(9, 10, "Is your blood type A?");
        bloodTree.insertNoNode(9, 11, "Is your blood type B?");
        
        bloodTree.insertYesNode(10, 12, "Is your blood type A+?");
        bloodTree.insertNoNode(10, 13, "Is your blood type B?");
        
        bloodTree.insertYesNode(12, 14, "Your blood type has been recorded as A+.");
        bloodTree.insertNoNode(12, 15, "Your blood type has been recorded as A-");
        //DEAD END; go to next interview
        
        bloodTree.insertYesNode(13, 16, "Is your blood type B+?");
        bloodTree.insertNoNode(13, 19, "Is your blood type AB+?");

        bloodTree.insertYesNode(16, 17, "Your blood type has been recorded as B+.");
        bloodTree.insertNoNode(16, 18, "Your blood type has been recorded as B-.");
        //DEAD END; go to next interview

        bloodTree.insertYesNode(19, 20, "Your blood type has been recorded as AB+.");
        bloodTree.insertNoNode(19, 21, "Your blood type has been recorded as AB-.");
        //DEAD END; go to next interview

        return bloodTree;
    }
    public static Decision BuildTobaccoQSet()
    {
        Decision tobaccoTree = new Decision();
        tobaccoTree.createRoot(1, "Do you regularly use tobacco?"); 
        
        tobaccoTree.insertYesNode(1, 2, "Do you use more than 5 tobacco products per day?");
        tobaccoTree.insertNoNode(1, 3, "You have been recorded as a non-user of tobacco.");
        // DEAD END

        tobaccoTree.insertYesNode(2, 4, "Have you used tobacco for more than 1 year?");
        tobaccoTree.insertNoNode(2, 5, "You have been recorded as a light tobacco user.");
        // DEAD END

        tobaccoTree.insertYesNode(4, 6, "You have been recorded as a heavy, long-term tobacco user.");
        tobaccoTree.insertNoNode(4, 7, "You have been recorded as a heavy, recent tobacco user.");
        // DEAD END
        
        return tobaccoTree = new Decision();
    }
    public static Decision BuildAlcoholQSet()
    {
        Decision alcoholTree = new Decision();
        alcoholTree.createRoot(1, "Do you regularly consume alcohol?");

        alcoholTree.insertYesNode(1, 2, "Do you drink more than 3 times per week?");
        alcoholTree.insertNoNode(1, 3, "You have been recorded as a non-user of alcohol.");
        //DEAD END

        alcoholTree.insertYesNode(2, 4, "Have you been drinking regularly for more than 1 year?");
        alcoholTree.insertNoNode(2, 5, "You have been recorded as a moderate drinker.");
        //DEAD END

        alcoholTree.insertYesNode(4, 6, "You have been recorded as a heavy, long-term alcohol user.");
        alcoholTree.insertNoNode(4, 7, "You have been recorded as a heavy, recent alcohol user.");
        //DEAD END

        return alcoholTree;
    }
    public static Decision BuildDrugQSet()
    {
        Decision drugTree = new Decision();
        drugTree.createRoot(1, "Do you currently use any recreational drugs?");

        drugTree.insertYesNode(1, 2, "Do you use cannabis?");
        drugTree.insertNoNode(1, 10, "You have been recorded as a non-user of recreational drugs.");
        //DEAD END

        //Cannabis path
        drugTree.insertYesNode(2, 3, "Cannabis use recorded. Do you use stimulants (e.g., cocaine, amphetamines)?");
        drugTree.insertNoNode(2, 4, "Do you use stimulants (e.g., cocaine, amphetamines)?");

        //Stimulant path
        drugTree.insertYesNode(3, 5, "Stimulant use recorded. Do you use depressants (e.g., benzodiazepines)?");
        drugTree.insertNoNode(3, 6, "Do you use depressants (e.g., benzodiazepines)?");

        drugTree.insertYesNode(4, 5, "Stimulant use recorded. Do you use depressants (e.g., benzodiazepines)?");
        drugTree.insertNoNode(4, 6, "Do you use depressants (e.g., benzodiazepines)?");

        //Depressant path
        drugTree.insertYesNode(5, 7, "Depressant use recorded. Do you use hallucinogens (e.g., LSD, psilocybin)?");
        drugTree.insertNoNode(5, 8, "Do you use hallucinogens (e.g., LSD, psilocybin)?");

        drugTree.insertYesNode(6, 7, "Depressant use recorded. Do you use hallucinogens (e.g., LSD, psilocybin)?");
        drugTree.insertNoNode(6, 8, "Do you use hallucinogens (e.g., LSD, psilocybin)?");

        //Hallucinogen path
        drugTree.insertYesNode(7, 9, "Hallucinogen use recorded. Thank you for providing this information.");
        drugTree.insertNoNode(7, 9, "Thank you for providing this information.");
        drugTree.insertYesNode(8, 9, "Hallucinogen use recorded. Thank you for providing this information.");
        drugTree.insertNoNode(8, 9, "Thank you for providing this information.");
        
        return drugTree = new Decision();
    }
}