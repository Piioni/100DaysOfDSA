package Day_17;

public class ContainerWithMostWater {
    public static void main(String[] args) {

        String str = """
                You are given n non-negative integers a1, a2, ..., an where each represents a point at coordinate (i, ai).
                n vertical lines are drawn such that the two endpoints of the line i is at (i, ai) and (i, 0).
                Find two lines, which, together with the x-axis forms a container, such that the container contains the most water.
                Notice that you may not slant the container.
                """;

        String example = """
                Example 1:
                
                Input: height = [1,8,6,2,5,4,8,3,7]
                Output: 49
                Explanation: The above vertical lines are represented by array [1,8,6,2,5,4,8,3,7].
                In this case, the max area of water (blue section) the container can contain is 49.
                """;

        System.out.println(str);
        System.out.println(example);

        try{
            int[] height = {1,8,6,2,5,4,8,3,7};
            int result = maxArea(height);
            System.out.println("Output: " + result);
        } catch (Exception e){
            System.out.println("Error: " + e);
        }

    }

    public static int maxArea(int[] height) {
        int p1 = 0, p2 = height.length -1;
        int containerArea = 0;
        for(int i = 0; i < height.length -1 ; i++){
            int area = height[p1] > height[p2] ? height[p2--] * (p2+1 - p1) :
                    height[p1++] * (p2+1 - p1);
            if(area > containerArea ){
                containerArea = area;
            }
        }
        return containerArea;
    }
}
