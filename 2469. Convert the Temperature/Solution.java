class Solution {
    public double[] convertTemperature(double celsius) {
        // double kelvin, fahrenheit;
        // kelvin = celsius + 273.15;
        // fahrenheit = celsius * 1.80 + 32.00;
        double ans[] = {celsius + 273.15, celsius * 1.80 + 32.00};
        return ans;
    }
}