public class CuentaBancaria {

    int nunerocuenta;
    String titular;
    double balance;


    public CuentaBancaria(int nunerocuenta , String titular , double balance){
        this.nunerocuenta = nunerocuenta;
        this.titular = titular;
        this.balance = 0;

    }

    public String getTitular() {
        return titular;
    }

    public int getNunerocuenta() {
        return nunerocuenta;
    }

    public double getBalance() {
        return balance;
    }

    public void setNunerocuenta(int nunerocuenta) {
        this.nunerocuenta = nunerocuenta;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void recargar(double Valor){
        balance = balance + Valor;
    }

    public void retirar(double Valor){

        if ( balance - Valor <= 0 ){
            System.out.println("No se puede retirar más padrhe");
        }
        else{
            balance = balance - Valor;
        }
    }

    @Override
    public String toString(){
        return "Titular: " + titular + '\'' +
                "Balance" + balance + '\'' ;
    }
}
