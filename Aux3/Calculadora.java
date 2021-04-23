


public class Calculadora
{
  private double num1;
  private double num2;
  private double num3;
  private double X1;
  private double X2;
  private double Y1;
  private double Y2;
  private double hipotenusa;
  private double cateto;
  double ecuacionCuadraticaPositiva(double a, double b, double c){
        num1 = a;
        num2 = b;
        num3 = c;
        double solucion;
        solucion = (-b + (Math.sqrt(b*b-4*a*c)))/2*a;
        return solucion;
    }
  double ecuacionCuadraticaNegativa(double a, double b, double c){
        num1 = a;
        num2 = b;
        num3 = c;
        double solucion;
        solucion = ((- b - (Math.sqrt((b * b) - (4 * a * c))))/(2*a));
        return solucion;
    }
  double catetoFaltante(double hip, double catA){
        hipotenusa = hip;
        cateto = catA;
        double catB;
        catB = Math.sqrt(catA * catA - hip*hip);
        return catB;
    }  
  String ecuacionDeLaRecta(double X1, double Y1, double X2, double Y2){
        this.X1 = X1;
        this.Y1 = Y1;
        this.X2 = X2;
        this.Y2 = Y2;
        String y;
        String x;
        double m;
        String ecuacion;
        m = (Y1-Y2)/(X1-X2);
        ecuacion ="y" + (- m) +"x"+(-((Y1) + (m*X1)));
        return ecuacion;
    }
}
