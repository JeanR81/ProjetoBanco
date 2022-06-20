package ProjetoBanco;

import java.math.BigDecimal;

public class ContaVip extends Conta {

    private BigDecimal limiteCredito;
    public ContaVip(){}
    public ContaVip(Long numeroConta, Integer agencia) {
        super(numeroConta, agencia);
        this.limiteCredito = BigDecimal.ZERO;
    }
    public void setLimiteCredito(BigDecimal limiteCredito){
        this.limiteCredito = limiteCredito;
    }
    public BigDecimal getLimiteCredito(){
        return this.limiteCredito;
    }
    public void pedirLimiteCredito(){
        this.limiteCredito = this.limiteCredito.add(BigDecimal.valueOf(100));
    }
}
