import java.util.Arrays;

public class ArrayPartitionAndMerge {

    public static int[] partitionAndMerge(int[] array, int partitionSize, String order) {
        int length = array.length;

    
        if (partitionSize <= 0 || partitionSize > length) {
            throw new IllegalArgumentException("Invalid partition size");
        }

     
        int numPartitions = (int) Math.ceil((double) length / partitionSize);
        int[][] partitions = new int[numPartitions][];

       
        for (int i = 0; i < numPartitions; i++) {
            int start = i * partitionSize;
            int end = Math.min((i + 1) * partitionSize, length);
            partitions[i] = Arrays.copyOfRange(array, start, end);
        }

        
        int[] result = mergePartitions(partitions, order);

        return result;
    }

    private static int[] mergePartitions(int[][] partitions, String order) {
        int numPartitions = partitions.length;

        
        int[] result = new int[numPartitions * partitions[0].length];

       
        int resultIndex = 0;
        for (int i = 0; i < partitions[0].length; i++) {
            for (int j = 0; j < numPartitions; j++) {
                result[resultIndex++] = partitions[j][i];
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int partitionSize = 3;
        String order = "row"; // Specify "row" for row-wise merging, "column" for column-wise merging

        int[] result = partitionAndMerge(array, partitionSize, order);

        System.out.println(Arrays.toString(result));
    }
}
