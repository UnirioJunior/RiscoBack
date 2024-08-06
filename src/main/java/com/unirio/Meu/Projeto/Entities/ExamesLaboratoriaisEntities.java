package com.unirio.Meu.Projeto.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class ExamesLaboratoriaisEntities {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	private String h2;
    private String leuc;
    private String plaquetas;
    private String gj;
    private String ur;
    private String cr;
    private String na;
    private String k;
    private String ca;
    private String ttpa;
    private String tap;
    private String rni;
    private String tgo;
    private String tgp;
    
       
    public ExamesLaboratoriaisEntities() {
    	
    }
    
    
    
	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public String getH2() {
		return h2;
	}



	public void setH2(String h2) {
		this.h2 = h2;
	}



	public String getLeuc() {
		return leuc;
	}



	public void setLeuc(String leuc) {
		this.leuc = leuc;
	}



	public String getPlaquetas() {
		return plaquetas;
	}



	public void setPlaquetas(String plaquetas) {
		this.plaquetas = plaquetas;
	}



	public String getGj() {
		return gj;
	}



	public void setGj(String gj) {
		this.gj = gj;
	}



	public String getUr() {
		return ur;
	}



	public void setUr(String ur) {
		this.ur = ur;
	}



	public String getCr() {
		return cr;
	}



	public void setCr(String cr) {
		this.cr = cr;
	}



	public String getNa() {
		return na;
	}



	public void setNa(String na) {
		this.na = na;
	}



	public String getK() {
		return k;
	}



	public void setK(String k) {
		this.k = k;
	}



	public String getCa() {
		return ca;
	}



	public void setCa(String ca) {
		this.ca = ca;
	}



	public String getTtpa() {
		return ttpa;
	}



	public void setTtpa(String ttpa) {
		this.ttpa = ttpa;
	}



	public String getTap() {
		return tap;
	}



	public void setTap(String tap) {
		this.tap = tap;
	}



	public String getRni() {
		return rni;
	}



	public void setRni(String rni) {
		this.rni = rni;
	}



	public String getTgo() {
		return tgo;
	}



	public void setTgo(String tgo) {
		this.tgo = tgo;
	}



	public String getTgp() {
		return tgp;
	}



	public void setTgp(String tgp) {
		this.tgp = tgp;
	}



	@Override
    public String toString() {     
    return "ExamesLaboratoriaisEntities{" +             
    "H2='" + h2 + '\'' +            
    ", LEUC='" + leuc + '\'' +           
    ", PLAQUETAS='" + plaquetas + '\'' +         
    ", GJ='" + gj + '\'' +          
    ", UR='" + ur + '\'' +        
    ", CR='" + cr + '\'' +
    ", Na='" + na + '\'' +
    ", K='" + k + '\'' +    
    ", Ca='" + ca + '\'' +
    ", TTPA='" + ttpa + '\'' +
    ", TAP='" + tap + '\'' +    
    ", RNI='" + rni + '\'' +  
    ", TGO='" + tgo + '\'' +    
    ", TGP='" + tgp + '\'' +'}';
        }

}
