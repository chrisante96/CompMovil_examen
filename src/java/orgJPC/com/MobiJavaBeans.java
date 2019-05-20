package orgJPC.com;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
@ManagedBean
@RequestScoped
public class MobiJavaBeans {
int n1;
int n2;
int n3;
int max;
public MobiJavaBeans() {
}
public void mayor(){
if(n1>n2 && n1>n3)
   max=n1; 
else{
    if(n2>n1 && n2>n3)
        max=n2;
   else
        max=n3;
}
FacesContext c = FacesContext.getCurrentInstance();
c.addMessage(null, new FacesMessage("Mayor de tres Numeros","Mayor= "+max));
}
public int getN1() {
return n1;
}
public void setN1(int n1) {
this.n1 = n1;
}
public int getN2() {
return n2;
}
public void setN2(int n2) {
this.n2 = n2;
}
public int getN3() {
return n3;
}
public void setN3(int n3) {
this.n3 = n3;
}
public int getMax() {
return max;
}
public void setMax(int max) {
this.max = max;
}
}