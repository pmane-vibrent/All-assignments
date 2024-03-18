import java.util.*;

public class Ass4 {
    public static void main(String[] args){

        String[] answers=new String[11];
        String[] questions = {"",
                "What is the time complexity of linear search in an array of size n?",
                "Which data structure is used to implement recursion?",
                "In a binary search tree, which traversal visits the nodes in ascending order?",
                "What is the time complexity of inserting an element at the end of a dynamic array (with resizing)?",
                "Which sorting algorithm has a worst-case time complexity of O(n^2)?",
                "What is the purpose of a hash function in hash tables?",
                "What is the time complexity of the quicksort algorithm in the average case?",
                "Which data structure uses LIFO order?",
                "What does DFS stand for in the context of graphs?",
                "Which of the following is not a searching algorithm?",
                "What is the main advantage of using a linked list over an array?",
                "Which data structure is used for checking the balance of parentheses in an expression?",
                "In a priority queue, which element is removed first?",
                "What is the time complexity of binary search on a sorted array?",
                "What is the purpose of the 'break' statement in a loop?"

        };
        String[] answer={ " ","O(n)",
                "Stack",
                "Inorder",
                "O(1)",
                "Bubble Sort",
                "Map values to array indices",
                "O(n log n)",
                "Stack",
                "Depth First Search",
                "Bubble Sort",
                "Dynamic size and efficient insertions/deletions",
                "Stack",
                "Highest priority",
                "O(log n)",
                "To exit the loop prematurely"
                };
        Scanner sc=new Scanner(System.in);
        List<Integer> range=new ArrayList<>();
        for(int i=1;i<=15;i++){
            range.add(i);
        }
        Collections.shuffle(range);
        Integer[] r=new Integer[range.size()];
        r=range.toArray(r);
        for(int i=1;i<=10;i++)
        {
            switch (r[i])
            {
                case 1: {
                    System.out.println("Question 1"+questions[1]);
                    String op1 = "O(1)";
                    String op2 = "O(log n)";
                    String op3="O(n)";
                    String op4="O(n^2)";
                    System.out.println("1. "+op1);
                    System.out.println("2. "+op2);
                    System.out.println("3. "+op3);
                    System.out.println("4. "+op4);
                    System.out.println("Enter the answer:");
                    int j= sc.nextInt();
                    if(j==1)
                    {
                        answers[i]=op1;
                    }
                    else if(j==2){
                        answers[i]=op2;
                    }else if(j==3){
                        answers[i]=op3;
                    } else if (j==4) {
                        answers[i]=op4;

                    } else{
                        System.out.println("Invalid choice \nEnter Again...");
                        i--;
                    }

                    break;
                }
                case 2: {
                    System.out.println("Question 2"+questions[2]);
                    String op1 = "Stack";
                    String op2 = "Architecture Neutral";
                    String op3=" Use of pointers";
                    String op4="Object-oriented";
                    System.out.println("1. "+op1);
                    System.out.println("2. "+op2);
                    System.out.println("3. "+op3);
                    System.out.println("4. "+op4);
                    System.out.println("Enter the answer:");
                    int j= sc.nextInt();
                    if(j==1)
                    {
                        answers[i]=op1;
                    }
                    else if(j==2){
                        answers[i]=op2;
                    }else if(j==3){
                        answers[i]=op3;
                    }else if (j==4) {
                        answers[i]=op4;

                    }else{
                        System.out.println("Invalid choice \nEnter Again...");
                        i--;
                    }
                    break;
                }
                case 3: {
                    System.out.println("Question 3"+questions[3]);
                    String op1 = "Unicode escape sequence";
                    String op2 = "Octal escape";
                    String op3="Inorder";
                    String op4="Line feed";
                    System.out.println("1. "+op1);
                    System.out.println("2. "+op2);
                    System.out.println("3. "+op3);
                    System.out.println("4. "+op4);
                    System.out.println("Enter the answer:");
                    int j= sc.nextInt();
                    if(j==1)
                    {
                        answers[i]=op1;
                    }
                    else if(j==2){
                        answers[i]=op2;
                    }else if(j==3){
                        answers[i]=op3;
                    }else if (j==4) {
                        answers[i]=op4;

                    }else{
                        System.out.println("Invalid choice \nEnter Again...");
                        i--;
                    }
                    break;
                }
                case 4: {
                    System.out.println("Question 4"+questions[4]);
                    String op1 = "O(1)";
                    String op2 = "JRE";
                    String op3="JDK";
                    String op4="JDB";
                    System.out.println("1. "+op1);
                    System.out.println("2. "+op2);
                    System.out.println("3. "+op3);
                    System.out.println("4. "+op4);
                    System.out.println("Enter the answer:");
                    int j= sc.nextInt();
                    if(j==1)
                    {
                        answers[i]=op1;
                    }
                    else if(j==2){
                        answers[i]=op2;
                    }else if(j==3){
                        answers[i]=op3;
                    }else if (j==4) {
                        answers[i]=op4;

                    }else{
                        System.out.println("Invalid choice \nEnter Again...");
                        i--;
                    }
                    break;
                }
                case 5: {
                    System.out.println("Question 5"+questions[5]);
                    String op1 = "Bubble Sort";
                    String op2 = "char cr = \\u0223;";
                    String op3="char ca = 'tea';";
                    String op4="char cc = '\\itea';";
                    System.out.println("1. "+op1);
                    System.out.println("2. "+op2);
                    System.out.println("3. "+op3);
                    System.out.println("4. "+op4);
                    System.out.println("Enter the answer:");
                    int j= sc.nextInt();
                    if(j==1)
                    {
                        answers[i]=op1;
                    }
                    else if(j==2){
                        answers[i]=op2;
                    }else if(j==3){
                        answers[i]=op3;
                    }else if (j==4) {
                        answers[i]=op4;

                    }else{
                        System.out.println("Invalid choice \nEnter Again...");
                        i--;
                    }
                    break;
                }
                case 6: {
                    System.out.println("Question 6"+questions[6]);
                    String op1 = "Map values to array indices";
                    String op2 = "int";
                    String op3="long";
                    String op4="void";
                    System.out.println("1. "+op1);
                    System.out.println("2. "+op2);
                    System.out.println("3. "+op3);
                    System.out.println("4. "+op4);
                    System.out.println("Enter the answer:");
                    int j= sc.nextInt();
                    if(j==1)
                    {
                        answers[i]=op1;
                    }
                    else if(j==2){
                        answers[i]=op2;
                    }else if(j==3){
                        answers[i]=op3;
                    }else if (j==4) {
                        answers[i]=op4;

                    }else{
                        System.out.println("Invalid choice \nEnter Again...");
                        i--;
                    }
                    break;
                }
                case 7: {
                    System.out.println("Question 7"+questions[7]);
                    String op1 = "ABH8097";
                    String op2 = "O(n log n)";
                    String op3="904423";
                    String op4="0xnf029L";
                    System.out.println("1. "+op1);
                    System.out.println("2. "+op2);
                    System.out.println("3. "+op3);
                    System.out.println("4. "+op4);
                    System.out.println("Enter the answer:");
                    int j= sc.nextInt();
                    if(j==1)
                    {
                        answers[i]=op1;
                    }
                    else if(j==2){
                        answers[i]=op2;
                    }else if(j==3){
                        answers[i]=op3;
                    }else if (j==4) {
                        answers[i]=op4;

                    }else{
                        System.out.println("Invalid choice \nEnter Again...");
                        i--;
                    }
                    break;
                }
                case 8: {
                    System.out.println("Question 8"+questions[8]);
                    String op1 = "Stack";
                    String op2 = "Not a Number";
                    String op3="Infinity";
                    String op4="Run time exception";
                    System.out.println("1. "+op1);
                    System.out.println("2. "+op2);
                    System.out.println("3. "+op3);
                    System.out.println("4. "+op4);
                    System.out.println("Enter the answer:");
                    int j= sc.nextInt();
                    if(j==1)
                    {
                        answers[i]=op1;
                    }
                    else if(j==2){
                        answers[i]=op2;
                    }else if(j==3){
                        answers[i]=op3;
                    }else if (j==4) {
                        answers[i]=op4;

                    }else{
                        System.out.println("Invalid choice \nEnter Again...");
                        i--;
                    }
                    break;
                }
                case 9: {
                    System.out.println("Question 9"+questions[9]);
                    String op1 = "Depth First Search";
                    String op2 = "23";
                    String op3="20";
                    String op4="25";
                    System.out.println("1. "+op1);
                    System.out.println("2. "+op2);
                    System.out.println("3. "+op3);
                    System.out.println("4. "+op4);
                    System.out.println("Enter the answer:");
                    int j= sc.nextInt();
                    if(j==1)
                    {
                        answers[i]=op1;
                    }
                    else if(j==2){
                        answers[i]=op2;
                    }else if(j==3){
                        answers[i]=op3;
                    }else if (j==4) {
                        answers[i]=op4;

                    }else{
                        System.out.println("Invalid choice \nEnter Again...");
                        i--;
                    }
                    break;
                }
                case 10: {
                    System.out.println("Question 10"+questions[10]);
                    String op1 = "Bubble Sort";
                    String op2 = "hi2";
                    String op3="hi3";
                    String op4="hi4";
                    System.out.println("1. "+op1);
                    System.out.println("2. "+op2);
                    System.out.println("3. "+op3);
                    System.out.println("4. "+op4);
                    System.out.println("Enter the answer:");
                    int j= sc.nextInt();
                    if(j==1)
                    {
                        answers[i]=op1;
                    }
                    else if(j==2){
                        answers[i]=op2;
                    }else if(j==3){
                        answers[i]=op3;
                    }else if (j==4) {
                        answers[i]=op4;

                    }else{
                        System.out.println("Invalid choice \nEnter Again...");
                        i--;
                    }
                    break;
                }
                case 11: {
                    System.out.println("Question 11"+questions[11]);
                    String op1 = "hi";
                    String op2 = "hi2";
                    String op3="hi3";
                    String op4="Dynamic size and efficient insertions/deletions";
                    System.out.println("1. "+op1);
                    System.out.println("2. "+op2);
                    System.out.println("3. "+op3);
                    System.out.println("4. "+op4);
                    System.out.println("Enter the answer:");
                    int j= sc.nextInt();
                    if(j==1)
                    {
                        answers[i]=op1;
                    }
                    else if(j==2){
                        answers[i]=op2;
                    }else if(j==3){
                        answers[i]=op3;
                    } else if (j==4) {
                        answers[i]=op4;

                    } else{
                        System.out.println("Invalid choice \nEnter Again...");
                        i--;
                    }

                    break;
                }
                case 12: {
                    System.out.println("Question 12"+questions[12]);
                    String op1 = "hi";
                    String op2 = "hi2";
                    String op3="Stack";
                    String op4="hi4";
                    System.out.println("1. "+op1);
                    System.out.println("2. "+op2);
                    System.out.println("3. "+op3);
                    System.out.println("4. "+op4);
                    System.out.println("Enter the answer:");
                    int j= sc.nextInt();
                    if(j==1)
                    {
                        answers[i]=op1;
                    }
                    else if(j==2){
                        answers[i]=op2;
                    }else if(j==3){
                        answers[i]=op3;
                    }else if (j==4) {
                        answers[i]=op4;

                    }else{
                        System.out.println("Invalid choice \nEnter Again...");
                        i--;
                    }
                    break;
                }
                case 13: {
                    System.out.println("Question 13"+questions[13]);
                    String op1 = "hi";
                    String op2 = "hi2";
                    String op3="Highest priority";
                    String op4="hi4";
                    System.out.println("1. "+op1);
                    System.out.println("2. "+op2);
                    System.out.println("3. "+op3);
                    System.out.println("4. "+op4);
                    System.out.println("Enter the answer:");
                    int j= sc.nextInt();
                    if(j==1)
                    {
                        answers[i]=op1;
                    }
                    else if(j==2){
                        answers[i]=op2;
                    }else if(j==3){
                        answers[i]=op3;
                    }else if (j==4) {
                        answers[i]=op4;

                    }else{
                        System.out.println("Invalid choice \nEnter Again...");
                        i--;
                    }
                    break;
                }
                case 14: {
                    System.out.println("Question 14"+questions[14]);
                    String op1 = "hi";
                    String op2 = "hi2";
                    String op3="O(log n)";
                    String op4="hi4";
                    System.out.println("1. "+op1);
                    System.out.println("2. "+op2);
                    System.out.println("3. "+op3);
                    System.out.println("4. "+op4);
                    System.out.println("Enter the answer:");
                    int j= sc.nextInt();
                    if(j==1)
                    {
                        answers[i]=op1;
                    }
                    else if(j==2){
                        answers[i]=op2;
                    }else if(j==3){
                        answers[i]=op3;
                    }else if (j==4) {
                        answers[i]=op4;

                    }else{
                        System.out.println("Invalid choice \nEnter Again...");
                        i--;
                    }
                    break;
                }
                case 15: {
                    System.out.println("Question 15"+questions[15]);
                    String op1 = "hi";
                    String op2 = "hi2";
                    String op3="To exit the loop prematurely";
                    String op4="hi4";
                    System.out.println("1. "+op1);
                    System.out.println("2. "+op2);
                    System.out.println("3. "+op3);
                    System.out.println("4. "+op4);
                    System.out.println("Enter the answer:");
                    int j= sc.nextInt();
                    if(j==1)
                    {
                        answers[i]=op1;
                    }
                    else if(j==2){
                        answers[i]=op2;
                    }else if(j==3){
                        answers[i]=op3;
                    }else if (j==4) {
                        answers[i]=op4;

                    }else{
                        System.out.println("Invalid choice \nEnter Again...");
                        i--;
                    }
                    break;
                }
//                case 16: {
//                    System.out.println("Question 16");
//                    String op1 = "hi";
//                    String op2 = "hi2";
//                    String op3="hi3";
//                    String op4="hi4";
//                    System.out.println("1. "+op1);
//                    System.out.println("2. "+op2);
//                    System.out.println("3. "+op3);
//                    System.out.println("4. "+op4);
//                    System.out.println("Enter the answer:");
//                    int j= sc.nextInt();
//                    if(j==1)
//                    {
//                        answers[i]=op1;
//                    }
//                    else if(j==2){
//                        answers[i]=op2;
//                    }else if(j==3){
//                        answers[i]=op3;
//                    }else if (j==4) {
//                        answers[i]=op4;
//
//                    }else{
//                        System.out.println("Invalid choice \nEnter Again...");
//                        i--;
//                    }
//                    break;
//                }
//                case 17: {
//                    System.out.println("Question 17");
//                    String op1 = "hi";
//                    String op2 = "hi2";
//                    String op3="hi3";
//                    String op4="hi4";
//                    System.out.println("1. "+op1);
//                    System.out.println("2. "+op2);
//                    System.out.println("3. "+op3);
//                    System.out.println("4. "+op4);
//                    System.out.println("Enter the answer:");
//                    int j= sc.nextInt();
//                    if(j==1)
//                    {
//                        answers[i]=op1;
//                    }
//                    else if(j==2){
//                        answers[i]=op2;
//                    }else if(j==3){
//                        answers[i]=op3;
//                    }else if (j==4) {
//                        answers[i]=op4;
//
//                    }else{
//                        System.out.println("Invalid choice \nEnter Again...");
//                        i--;
//                    }
//                    break;
//                }
//                case 18: {
//                    System.out.println("Question 18");
//                    String op1 = "hi";
//                    String op2 = "hi2";
//                    String op3="hi3";
//                    String op4="hi4";
//                    System.out.println("1. "+op1);
//                    System.out.println("2. "+op2);
//                    System.out.println("3. "+op3);
//                    System.out.println("4. "+op4);
//                    System.out.println("Enter the answer:");
//                    int j= sc.nextInt();
//                    if(j==1)
//                    {
//                        answers[i]=op1;
//                    }
//                    else if(j==2){
//                        answers[i]=op2;
//                    }else if(j==3){
//                        answers[i]=op3;
//                    }else if (j==4) {
//                        answers[i]=op4;
//
//                    }else{
//                        System.out.println("Invalid choice \nEnter Again...");
//                        i--;
//                    }
//                    break;
//                }
//                case 19: {
//                    System.out.println("Question 19");
//                    String op1 = "hi";
//                    String op2 = "hi2";
//                    String op3="hi3";
//                    String op4="hi4";
//                    System.out.println("1. "+op1);
//                    System.out.println("2. "+op2);
//                    System.out.println("3. "+op3);
//                    System.out.println("4. "+op4);
//                    System.out.println("Enter the answer:");
//                    int j= sc.nextInt();
//                    if(j==1)
//                    {
//                        answers[i]=op1;
//                    }
//                    else if(j==2){
//                        answers[i]=op2;
//                    }else if(j==3){
//                        answers[i]=op3;
//                    }else if (j==4) {
//                        answers[i]=op4;
//
//                    }else{
//                        System.out.println("Invalid choice \nEnter Again...");
//                        i--;
//                    }
//                    break;
//                }
//                case 20: {
//                    System.out.println("Question 20");
//                    String op1 = "hi";
//                    String op2 = "hi2";
//                    String op3="hi3";
//                    String op4="hi4";
//                    System.out.println("1. "+op1);
//                    System.out.println("2. "+op2);
//                    System.out.println("3. "+op3);
//                    System.out.println("4. "+op4);
//                    System.out.println("Enter the answer:");
//                    int j= sc.nextInt();
//                    if(j==1)
//                    {
//                        answers[i]=op1;
//                    }
//                    else if(j==2){
//                        answers[i]=op2;
//                    }else if(j==3){
//                        answers[i]=op3;
//                    }else if (j==4) {
//                        answers[i]=op4;
//
//                    }else{
//                        System.out.println("Invalid choice \nEnter Again...");
//                        i--;
//                    }
//                    break;
//                }
                default:
                {

                }
            }

        }
        int marks=0;
        System.out.println("Answers:\n");
        for(int i=1;i<=10;i++){
            System.out.println("Question "+i);
            System.out.println(questions[r[i]]);
            System.out.println("\nActual Answer :");
            System.out.println(answer[r[i]]);
            System.out.println("\nYour Answer :");
            System.out.println(answers[i]);
            if(answer[r[i]].equals(answers[i]))
            {
                System.out.println("\nYou gave right answer");
                marks++;
            }
            else {

                System.out.println("\nYou gave wrong answer");
            }
            System.out.println("\n\n");
        }
        if(marks>5){

            System.out.println("You are pass in exam \n You scored :"+marks);
        }
        else{
            System.out.println("You are fail in exam \n You scored :"+marks);
        }

    }
}
