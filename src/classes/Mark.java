
package classes;


public class Mark {
    
    private int id;
    private String nic;
    private int econ;
    private int bs;
    private int accounting;

    public Mark(int id, String nic, int econ, int bs, int accounting) {
        this.id = id;
        this.nic = nic;
        this.econ = econ;
        this.bs = bs;
        this.accounting = accounting;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNic() {
        return nic;
    }

    public void setNic(String nic) {
        this.nic = nic;
    }

    public int getEcon() {
        return econ;
    }

    public void setEcon(int econ) {
        this.econ = econ;
    }

    public int getBs() {
        return bs;
    }

    public void setBs(int bs) {
        this.bs = bs;
    }

    public int getAccounting() {
        return accounting;
    }

    public void setAccounting(int accounting) {
        this.accounting = accounting;
    }
  
   
}
