package its340.finalproject;

public class BuildTrees 
{
    public static void BuildAllInterviewQuestionSets()
    {
        GlobalData.AnimalTreeQSet = BuildAnimalQuestionSet();
        //call other builds for all other questionsets
    }
    
    public static Decision BuildAnimalQuestionSet()
    {
        Decision myAnimalTree = new Decision();
        myAnimalTree.createRoot(1, "Does animal eat meat?"); //ID, question
        
        myAnimalTree.insertYesNode(1, 2, "Does animal have stripes?"); //attach to, ID, question 
        myAnimalTree.insertNoNode(2, 3, "Animal is leopard");
        myAnimalTree.insertYesNode(2, 4, "Animal is tiger");
        
        myAnimalTree.insertNoNode(1, 5, "Is animal an equine?");
        myAnimalTree.insertYesNode(5, 6, "Animal is horse");
        
        myAnimalTree.insertNoNode(5, 7, "Ia animal a bovine?");
        myAnimalTree.insertYesNode(7, 8, "Animal is cow");
        
        return myAnimalTree;
    }
}