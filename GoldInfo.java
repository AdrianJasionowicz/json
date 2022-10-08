package java;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class GetDatum {

    @SerializedName("data")
    @Expose
    private String data;
    @SerializedName("cena")
    @Expose
    private Double cena;

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Double getCena() {
        return cena;
    }

    public void setCena(Double cena) {
        this.cena = cena;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "GetDatum{" +
                "data='" + data + '\'' +
                ", cena=" + cena +
                '}';
    }
}