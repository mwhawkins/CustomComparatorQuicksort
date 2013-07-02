/*
 * @author: Michael Hawkins
 * @description: The main class of the comparator example doing a quicksort
 */
package CompSci;
import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    
    //the quicksort method with a single comparable list argument
    public static <E extends Comparable<E>> void quickSort(E[] list){
        quickSort(list, 0, list.length-1);
    }
    
    //the quicksort argument with multiple arguments 
    public static <E extends Comparable<E>> void quickSort(E[] list, int left, int right){  
        if (left < right){
            int pivotIndex = findPivot(list, 0, list.length-1);
            quickSort(list, left, pivotIndex-1);
            quickSort(list, pivotIndex+1, right);
        }
    }
    
    //the comparator quicksort method with a list and custom comparator
    public static <E> void quickSort(E[] list, Comparator<? super E> comparator){
        quickSort(list, comparator, 0, list.length-1);        
    }
    
    //the comparator quicksort method with multiple arguments
    public static <E> void quickSort(E[] list, Comparator<? super E> comparator, int left, int right){
        if (left < right){
            int pivotIndex = findPivotWithComparator(list, 0, list.length-1, comparator);
            quickSort(list, comparator, left, pivotIndex-1);
            quickSort(list, comparator, pivotIndex+1, right);
        }
    }
    
    //a swap methos for comparable arrays
    private static void swap(Comparable[] array, int i, int j)
    {
        Comparable temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
    
    //a swap method for ordinary arrays, probably redundant but cleaner
    private static void swap(Object[] array, int i, int j){
        Object temp = array[i];
        array[i] = array[j];
        array[j] = temp;
            
    }
    
    //method for finding the pivot index with a custom comparator
    public static <E> int findPivotWithComparator(E[] list, int left, int right, Comparator comparator){
        int first = left++;               
        while (left <= right){
            while (left <= right && comparator.compare(list[first],list[left]) >= 0){
                left++;
            }
            while (left <= right && comparator.compare(list[first], list[right]) < 0){
                right--;
            }
            if (left < right){
                swap(list, left++, right--);
            }
        }               
        swap(list, first, right);
        return right;
    }
    
    //method for finding the pivot index with a comparable list
    public static int findPivot(Comparable[] list, int left, int right){
       int first = left++;               
        while (left <= right){
            while (left <= right && list[first].compareTo(list[left]) >= 0){
                left++;
            }
            while (left <= right && list[first].compareTo(list[right]) < 0){
                right--;
            }
            if (left < right){
                swap(list, left++, right--);
            }
        }               
        swap(list, first, right);        
        return right;
        
    }
    
    public static void main(String[] args){           
        String[] list = {"Test", "One", "Alpha", "More"};
        quickSort(list);
        for (int i=0; i<=list.length-1;i++){
            System.out.print(list[i] + " \n");
        }
        System.out.println("----------------");
        Student[] studentList = {new Student(93),new Student(100), new Student(85), new Student(65)};
        quickSort(studentList, new StudentComparator());
        for (int i=0; i<=studentList.length-1;i++){
            System.out.print(studentList[i].toString());
        }    
        ArrayList<Double> ad = new ArrayList<Double>();
        ad.add(1.5);
        ad.add(6.2);
        ad.remove(1.5);
        System.out.println(ad.toString());        
        
    }
}
