
import java.util.*;
import java.io.FileWriter;
import java.io.File;
public class LAB7{
    public static void main(String[] args) {
        int count = 0;
        int i = 0;
        float[] col1 = new float[149];
                    float[] col2 = new float[149];
                    float[] col3 = new float[149];
                    float[] col4 = new float[149];
                    String col5=new String();
        try{
            File file = new File("C:/Users/pande/Downloads/iris.csv");
            Scanner read = new Scanner(file);
            while(read.hasNextLine()){
                String line = read.nextLine();
                if (count==0){
                    String[] header = line.split(",");
                }
                else{
                    String[] arr = line.split(",");
                    
                    
                    col1[i] = Float.parseFloat(arr[0]);
                    col2[i] = Float.parseFloat(arr[1]);
                    col3[i] = Float.parseFloat(arr[2]);
                    col4[i] = Float.parseFloat(arr[3]);
                    col5=arr[4];
                    i++;
                }
                count++;

            }
        }
        
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    float meanCol1 = mean(col1);
    float meanCol2 = mean(col2);
    float meanCol3 = mean(col3);
    float meanCol4 = mean(col4);
    System.out.println("***************MEAN*****************");
    System.out.println("|Mean of Sepal length is: | " + meanCol1);
    System.out.println("|Mean of Sepal Width is:  | " + meanCol2);
    System.out.println("|Mean of Petal length is: | " + meanCol3);
    System.out.println("|Mean of Petal Width is:  | " + meanCol4);


    // Call the median function for col1
    float medianCol1 = median(col1);
    float medianCol2 = median(col2);
    float medianCol3 = median(col3);
    float medianCol4 = median(col4);
    System.out.println("***************MEDIAN*****************");
    System.out.println("|Median of Sepal length is: | " + medianCol1);
    System.out.println("|Median of Sepal Width is:  | " + medianCol2);
    System.out.println("|Median of Petal length is: | " + medianCol3);
    System.out.println("|Median of Petal Width is:  | " + medianCol4);

    // Call the mode function for col1
    float modeCol1 = mode(col1);
    float modeCol2 = mode(col2);
    float modeCol3 = mode(col3);
    float modeCol4 = mode(col4);
    System.out.println("***************MODE*****************");
    System.out.println("|Mode of Sepal length is: | " + modeCol1);
    System.out.println("|Mode of Sepal Width is:  | " + modeCol2);
    System.out.println("|Mode of Petal length is: | " + modeCol3);
    System.out.println("|Mode of Petal Width is:  | " + modeCol4);

    //Call the max function for cols
    float maxCol1=max(col1);
    float maxCol2=max(col2);
    float maxCol3=max(col3);
    float maxCol4=max(col4);
    System.out.println("***************MAXIMUM*****************");
    System.out.println("|Max of Sepal length is: | " + maxCol1);
    System.out.println("|Max of Sepal Width is:  | " + maxCol2);
    System.out.println("|Max of Petal length is: | " + maxCol3);
    System.out.println("|Max of Petal Width is:  | " + maxCol4);

    //Call the max function for cols
    float minCol1=min(col1);
    float minCol2=min(col2);
    float minCol3=min(col3);
    float minCol4=min(col4);
    System.out.println("***************MINIMUM*****************");
    System.out.println("|Min of Sepal length is: | " + minCol1);
    System.out.println("|Min of Sepal Width is:  | " + minCol2);
    System.out.println("|Min of Petal length is: | " + minCol3);
    System.out.println("|Min of Petal Width is:  | " + minCol4);

    //Call the variety function
    displayOutput(); 
    
    
    }
    static float mean(float arr1[]){
        float sum=0;
        for(int i=0;i<arr1.length-1;i++){
            sum+=arr1[i];
        }
        float resMean=sum/arr1.length;
        return resMean;
    }
    static float median(float arr1[]){
        Arrays.sort(arr1);
        int len=arr1.length;
        //Since we already know the length of the cols are even
        return(arr1[len/2 -1] + arr1[len/2]) / 2;
    }
    static float mode(float arr1[]){
        float mode = 0;
        int maxCount = 0;
    
        for (int i = 0; i < arr1.length; i++) {
            float value = arr1[i];
            int count = 0;
            for (int j = 0; j < arr1.length; j++) {
                if (arr1[j] == value) {
                    count++;
                }
            }
            if (count > maxCount) {
                maxCount = count;
                mode = value;
            }
        }
        return mode;
    }
    static float max(float arr1[]){
        float maxi=0;
        for(int i=0;i<arr1.length;i++){
            if(arr1[i]>maxi){
                maxi=arr1[i];
            }
        }
        return maxi;
    }
    static float min(float arr1[]){
        float min=arr1[0];
        //float curr=arr1[0];
        for(int i=0;i<arr1.length;i++){
            if(arr1[i]<min){
                //curr=arr1[i];
                min=arr1[i];

            }
        }
        return min;
    }
    static float variety(float arr1[]){
        String types=" ";
        float setosa_count=0;
        float setosa_sum=0;
        float versicolor_count=0;
        float versicolor_sum=0;
        float verginica_count=0;
        float verginica_sum=0;

        for(int i=0;i<arr1.length;i++){
            if(types.equalsIgnoreCase("Setosa")){
                setosa_sum+=arr1[i];
                setosa_count++;
            }
            else if(types.equalsIgnoreCase("Versicolor")){
                versicolor_sum+=arr1[i];
                versicolor_count++;
            }
            else if(types.equalsIgnoreCase("Virginica")){
                versicolor_sum+=arr1[i];
                versicolor_count++;
            }

            }
            float setosa_mean=setosa_sum/setosa_count;
            float versicolor_mean=versicolor_sum/versicolor_count;
            float verginica_mean=verginica_sum/verginica_count;
            return setosa_mean;
            // return versicolor_mean;
            // return verginica_mean;
        }
        public static void displayOutput() {
            try {
                File file = new File("C:/Users/pande/Downloads/Summary.txt");
                Scanner object = new Scanner(file);
    
                while (object.hasNext()) {
                    System.out.println(object.nextLine());
                }
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }


 
        }
}

