package orgJPC.com;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import javax.swing.JOptionPane;

@ManagedBean
@RequestScoped
public class MobiJavaBeans {

    int Mayor = 0;
    int num1 = 0;
    int num2 = 0;
    int num3 = 0;
    
    public MobiJavaBeans() {
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public int getNum3() {
        return num3;
    }

    public void setNum3(int num3) {
        this.num3 = num3;
    }
    public void setlimpiar() {
        this.num1=0;
        this.num2=0;
        this.num3=0;
    }

    public int getmayor() {
        return Mayor;
    }

    public void setmayor(int Mayor) {
        this.Mayor = Mayor;
    }

    public void mayor() {
        if (num1 > num2 && num1 > num3) {
            Mayor = num1;
        } else {
            if (num2 > num1 && num2 > num3) {
                Mayor = num2;
            } else {
                Mayor = num3;
            }
        }
        FacesContext c = FacesContext.getCurrentInstance();
        c.addMessage(null, new FacesMessage("EL MAYOR ES:" +Mayor));
        
    }

    private void num1(String _) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
