package telran.java_lessons;
//Imagine that you have an array of strings of random length. Implement the method that returns how many groups of strings grouped by the same length are present. For example, there are 5 lines in the array: 2 are 10 characters long, 2 are 18 characters long and one is 4 characters long. So in this array there are 3 different groups.
public class GroupsArray {
    public static void main(String[] args) {
        String[]array = {"mama","papa","uncle","sister","sister","a"};
        System.out.println(group(array));

    }
    public static int group(String []array){
        int count= array.length;
        for (int i = 0; i < count; i++) {
            if (array[i].length()== array[i+1].length()){
                count--;
            }
        }
        return count;
    }
}
