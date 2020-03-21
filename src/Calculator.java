
public class Calculator {
	
	int degree; 
    final double PI = 3.14; 
    
    double getRad() {
        return (degree*PI)/180;
    }
    
    void setDeg(int deg) {
        degree = deg;
}
}