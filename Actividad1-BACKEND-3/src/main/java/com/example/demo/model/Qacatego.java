package com.example.demo.model;

import javax.persistence.*;

@Entity
@Table(name="QACATEGO")
public
class Qacatego 
{	@Id
	@Column(unique=true, nullable=false)
	private short Qa_Cat_Id;
	
	@Column(nullable=false)
	private String Cat_Nombre;
	
	@Column(nullable=false)
	private String Cat_Desc;

	@Column(nullable=false)
	private String Cat_tipo;
	
	public short getId()
	{return Qa_Cat_Id;}
	public void setIdCat(short Qa_Cat_Id)
	{this.Qa_Cat_Id =Qa_Cat_Id;}
	
	public String getCat_Nom()
	{return Cat_Nombre;}
	public void setId_Cat(String Cat_Nombre)
	{this.Cat_Nombre =Cat_Nombre;}
	
	public short getCat_Desc()
	{return Qa_Cat_Id;}
	public void setCat_Desct(String Cat_Desc)
	{this.Cat_Desc =Cat_Desc;}
	
	public String getCatTipo()
	{return Cat_tipo;}
	public void setCat_tipot(String Cat_tipo)
	{this.Cat_tipo =Cat_tipo;}
	
	

}
