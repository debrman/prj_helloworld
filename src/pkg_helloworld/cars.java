package pkg_helloworld;

import java.io.Serializable;

public class cars implements Serializable{

    public void setCarid(String carid) {
        this.carid = carid;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCarid() {
        return carid;
    }

    public String getName() {
        return name;
    }

    public String getVendor() {
        return vendor;
    }

    public String getType() {
        return type;
    }
    private String carid;
    private String name;
    private String vendor;
    private String type;           
}
