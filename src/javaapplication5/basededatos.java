/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication5;

/**
 *
 * @author SENA
 */
public class basededatos {
    private String tipochat;
    private String Nickusuario;
    private String Fotousuario;
    private String Mensaje;
    private String Fechamensaje;
    
    public void settipochat(String tipochatP){
     this.tipochat=tipochatP;   
    }
    public String gettipochat()
    {
        return tipochat;
    }
    public void setNickusuario(String NickusuarioP){
     this.Nickusuario=NickusuarioP;   
    }
    public String getNickusuario()
    {
        return Nickusuario;
    }
    public void setFotousuario(String FotousuarioP){
     this.Fotousuario=FotousuarioP;   
    }
    public String getFotousuario()
    {
        return Fotousuario;
    }
    public void setMensaje(String MensajeP){
     this.Mensaje=MensajeP;   
    }
    public String getMensaje()
    {
        return Mensaje;
    }
}
