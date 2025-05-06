package its340.finalproject;
import java.util.Scanner;
import java.util.Stack;

public class Decision 
{
    private Node root;
    Scanner sc = new Scanner(System.in);
    
    public Decision()
    {
        this.root = null;
    }
    
    public Node getRoot()
    {
        return root;
    }
    
    public void createRoot(int newRootNodeID, String question)
    {
        root = new Node(newRootNodeID, question);
    }
    
    public void insertYesNode(int existingNodeID, int newNodeID, String question)
    {
        Node newNode = new Node(newNodeID, question);
        Stack bTreeStack = new Stack(); //OR Stack<Node> bTreeStack = new Stack();
        bTreeStack.push(root);
        while(!bTreeStack.isEmpty() )
        {
            Node next = (Node)bTreeStack.pop();
            if(existingNodeID == next.nodeID)
            {
                if(next.yesBranch == null)
                {
                    next.yesBranch = newNode;
                    return;
                }
            }
            if (next.yesBranch != null)
            {
                bTreeStack.push(next.yesBranch);
            }
            if (next.noBranch != null)
            {
                bTreeStack.push(next.noBranch);
            }
        }
    }
    public void insertNoNode(int existingNodeID, int newNodeID, String question)
    {
        Node newNode = new Node(newNodeID, question);
        Stack bTreeStack = new Stack(); 
        bTreeStack.push(root);
        while(!bTreeStack.isEmpty() )
        {
            Node next = (Node)bTreeStack.pop();
            if(existingNodeID == next.nodeID)
            {
                if(next.noBranch == null)
                {
                    next.noBranch = newNode;
                    return;
                }
            }
            if (next.noBranch != null)
            {
                if (next.yesBranch != null)
                {
                    bTreeStack.push(next.yesBranch);
                }
            }
            if (next.yesBranch != null)
            {
                if (next.noBranch != null)
                {
                    bTreeStack.push(next.noBranch);
                }
            }
        }
    }
    public void queryTree(Node currentNode)
    {
        //check if question is final question
        if(currentNode.yesBranch == null && currentNode.noBranch == null)
        {
            System.out.print(currentNode.question);
            return;
        }
        askQuestion(currentNode);
    }
    public void askQuestion(Node currentNode)
    {
        System.out.print(currentNode.question + "Enter Y/N: ");
        String answer = sc.nextLine().toLowerCase();
        //DBUtils.writeToDB(currentNode.nodeID, answer);
        if(answer.equals("y"))
        {
            if(currentNode.yesBranch != null)
            {
                queryTree(currentNode.yesBranch);
            }
        }
        else if(answer.equals("n"))
        {
            if(currentNode.noBranch != null)
            {
                queryTree(currentNode.noBranch);
            }
        }
        else
        {
            System.out.println("Bad input. Must answer with Y or N.");
            askQuestion(currentNode);
        }
    }
}
