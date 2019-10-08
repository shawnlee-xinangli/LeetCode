class Solution {
    public double largestTriangleArea(int[][] points) {
        double res = 0;
        for (int[] x: points) {
            for (int[] y: points) {
                for (int[] z: points) {
                    double area = 
        Math.abs(x[0]*y[1]-x[0]*z[1]+y[0]*z[1]-y[0]*x[1]+z[0]*x[1]-z[0]*y[1])*0.5;
                    res = Math.max(area,res);
                }
            }
        }
        return res;
    }
}

/*
已知三点坐标 (X1,Y1),(X2,Y2),(X3,Y3)
围成的三角形面积 = 0.5*|X1*Y2-X1*Y3 + X2*Y3-X2*Y1 + X3*Y1-X3*Y2|
*/
