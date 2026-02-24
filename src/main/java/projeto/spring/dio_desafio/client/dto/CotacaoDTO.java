package projeto.spring.dio_desafio.client.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.math.BigDecimal;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CotacaoDTO {

    private String code;
    private String codein;
    private String bid;      // Preço de compra
    private String ask;      // Preço de venda
    private String high;     // Máximo do dia
    private String low;      // Mínimo do dia
    private String create_date;

    // Construtor padrão (obrigatório para o Jackson)
    public CotacaoDTO() {}

    // Getters e Setters
    public String getCode() { return code; }
    public void setCode(String code) { this.code = code; }

    public String getCodein() { return codein; }
    public void setCodein(String codein) { this.codein = codein; }

    public String getBid() { return bid; }
    public void setBid(String bid) { this.bid = bid; }

    public String getAsk() { return ask; }
    public void setAsk(String ask) { this.ask = ask; }

    public String getHigh() { return high; }
    public void setHigh(String high) { this.high = high; }

    public String getLow() { return low; }
    public void setLow(String low) { this.low = low; }

    public String getCreate_date() { return create_date; }
    public void setCreate_date(String create_date) { this.create_date = create_date; }

    // Método útil para converter bid para BigDecimal
    public BigDecimal getBidAsBigDecimal() {
        try {
            return new BigDecimal(bid);
        } catch (Exception e) {
            return BigDecimal.ZERO;
        }
    }

    @Override
    public String toString() {
        return "CotacaoDTO{" +
                "code='" + code + '\'' +
                ", codein='" + codein + '\'' +
                ", bid='" + bid + '\'' +
                ", create_date='" + create_date + '\'' +
                '}';
    }
}