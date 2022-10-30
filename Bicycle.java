/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class Bicycle {
    private String ownerName;
    private String tagNo;
    private String id;
    
    public Bicycle(){
        ownerName = "Unassigned";
        id = "xxxx-xxxx";
    }
    public Bicycle(String tagNo,String name){
        this.id = tagNo;
        ownerName = name;
    }
    
    public String getOwnerName(){
        return ownerName;
    }
    
    public void setOwnerName(String name){
        ownerName = name;
    }
    
    public String getTagNo(){
        return tagNo;
    }
    public void settagNo(String TagNo){
        tagNo = TagNo;
    }
    
}
