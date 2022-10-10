package modelo;

import modelo.utils.RedSocialEmpresaEnum;

public class RedSocial {

    private RedSocialEmpresaEnum empresa;
    private String dominio;

    public RedSocial(RedSocialEmpresaEnum empresa, String dominio) {
        this.empresa = empresa;
        this.dominio = dominio;
    }

    public RedSocialEmpresaEnum getEmpresa() {
        return empresa;
    }

    public void setEmpresa(RedSocialEmpresaEnum empresa) {
        this.empresa = empresa;
    }

    public String getDominio() {
        return dominio;
    }

    public void setDominio(String dominio) {
        this.dominio = dominio;
    }

    @Override
    public String toString() {
        return "RedSocial{" +
                "empresa=" + empresa +
                ", dominio='" + dominio + '\'' +
                '}';
    }

}
