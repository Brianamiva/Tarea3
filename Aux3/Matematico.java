
import static java.lang.System.out;
public class Matematico
{
   private double n1, n2, n3;
   private Calculadora calculadora;
   String mostrarNumMenor(double num1, double num2, double num3){
       n1 = num1;
       n2 = num2;
       n3 = num3;
       String reporte;
       if((num1<num2)&&(num1<num3)){
           reporte = "num1 es el menor";
        }else{
            if((num2<num1)&&(num2<num3)){
            reporte = "num2 es el menor";
        }else{
            reporte = "num3 es el menor";     
    }
        }
        return reporte;
    }
    String mostrarNumeroDelMedio(double num1, double num2, double num3){
        n1 = num1;
        n2 = num2;
        n3 = num3;
        String reporte;
        if((num1>num2)&&(num1<num3)){
            reporte = "num1 es el numero del medio";
        }else{
            if((num2>num1)&&(num2<num3)){
            reporte = "num2 es el numero del medio";
        }else{
            reporte = "num3 es el numero del medio";
        }
        
    }
       return reporte;
}
    String mostrarNumeroMayor(double num1, double num2, double num3){
        n1 = num1;
        n2 = num2;
        n3 = num3;
        String reporte;
        if((num1>num2)&&(num1>num3)){
            reporte = "num1 es el mayor";
    }else{
        if((num2>num1)&&(num2>num3)){
        reporte = "num2 es el mayor";
    }else{
        reporte = "num3 es el mayor";
    }
    }
    return reporte;
}
    double areaDelCuadrado(double base, double altura){
        n1 = base;
        n2 = altura;
        double area;
        area = (base*base);
        area = (altura*altura);
        return area;
    }
    double distanciaEntreDosPuntos(double X1, double X2, double Y1, double Y2 ){
        double distancia;
        distancia = Math.abs(Math.sqrt((X2-X1)*(X2-X1)+(Y2-Y1)*(Y2-Y1)));
        return distancia;
    }
    String enQueCuadranteSeEncuentra(double x, double y){
        String reporte;
        if((x>=0)&&(y>=0)){
            reporte = "Su punto se encuentra en el primer cuadrante";
        }else{
            if((x<0)&&(y>=0)){
                reporte = "Su punto esta en el segundo cuadrante";
            }else{
                if((x<0)&&(y<0)){
                    reporte = "Su punto esta en tercer cuadrante";
                }else{
                    reporte = "Su punto esta en el cuarto cuadrante";
                }
            }
        }
        return reporte;
    }
    public Matematico(Calculadora calculadora){
        calculadora = calculadora;
    }
}
