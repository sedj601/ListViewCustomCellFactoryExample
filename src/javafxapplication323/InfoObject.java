/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication323;

/**
 *
 * @author blj0011
 */
class InfoObject
{

    private String nameTl;
    private String authorTl;
    private String descTl;
    private String textField;

    public InfoObject(String nameTl, String authorTl, String descTl, String textField)
    {
        this.nameTl = nameTl;
        this.authorTl = authorTl;
        this.descTl = descTl;
        this.textField = textField;
    }

    public String getNameTl()
    {
        return nameTl;
    }

    public void setNameTl(String nameTl)
    {
        this.nameTl = nameTl;
    }

    public String getAuthorTl()
    {
        return authorTl;
    }

    public void setAuthorTl(String authorTl)
    {
        this.authorTl = authorTl;
    }

    public String getDescTl()
    {
        return descTl;
    }

    public void setDescTl(String descTl)
    {
        this.descTl = descTl;
    }

    public String getTextField()
    {
        return textField;
    }

    public void setTextField(String textField)
    {
        this.textField = textField;
    }
}
