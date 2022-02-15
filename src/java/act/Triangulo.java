/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package act;

/**
 *
 * @author salva
 */
public class Triangulo {

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }
    double base;
    double altura;
    double perimetro;
    double area;
    
    public Triangulo(double base, double altura){
        this.setBase(base);
        this.setAltura(altura);
    }
    
    public void calcularPerimetro(){
        double p = (3 * this.getBase());
        this.setPerimetro(p);
    }
    public void calcularArea(){
        double base = this.getBase(), altura =  this.getAltura();
        double a = ((base*altura)/2);
        this.setArea(a);
    }
}
