public class assistenciaMedica {
    private double salario;
    private double desconto;
    private double salarioLiquido;

    public double getSalario(){
        return salario;
    }
    public double getDesconto(){
        return desconto;
    }
    public void setSalario(double salario){
        this.salario = salario;
    }
    public void getsalarioLiquido(){
        return salarioLiquido;
    }
    public double defineSalarioLiquido(double salarioLiquido){
        if(this.salario>=0&&this.salario<=2000){
            salarioLiquido = this.salario;
            return salarioLiquido;
        }
        else if(this.salario>=2000&&this.salario<=4000){
            this.desconto = 2;
            salarioLiquido = this.salario*this.desconto/100;
            return salarioLiquido;
        }
        else{
            this.desconto = 4;
            salarioLiquido = this.salario*this.desconto/100;
            return salarioLiquido;
        }
    }
}
