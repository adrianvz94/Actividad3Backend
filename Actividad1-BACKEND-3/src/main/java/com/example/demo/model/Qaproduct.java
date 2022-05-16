package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="QAPRODUCT")

public class Qaproduct 
{
	@Id
	@Column(unique=true,nullable=false)
	private short Prod_id;;
	
	@Column(nullable=false)
	private short Qa_Cat_Id;
	
	@Column(nullable=false)
	private String Prod_Nombre;
	
	@Column(nullable=false)
	private String Prod_Desc;

	@Column(nullable=false)
	private String Prod_tipo;
	
	@Column(nullable=false)
	private String Prod_client;
	
	public short getId_Proct()
	{return Prod_id;}
	public void setId_Proct(short Prod_id)
	{this.Prod_id =Prod_id;}
	
	public short getId()
	{return Qa_Cat_Id;}
	public void setIdCat(short Qa_Cat_Id)
	{this.Qa_Cat_Id =Qa_Cat_Id;}
	
	public String getProd_Nom()
	{return Prod_Nombre;}
	public void setId_Cat(String Prod_Nombre)
	{this.Prod_Nombre =Prod_Nombre;}
	
	public short getProd_Desc()
	{return Qa_Cat_Id;}
	public void setCat_Desct(String Prod_Desc)
	{this.Prod_Desc =Prod_Desc;}
	
	public String getProd_Tipo()
	{return Prod_tipo;}
	public void setProd_tipot(String Prod_tipo)
	{this.Prod_tipo =Prod_tipo;}
	
	public String getProd_cliente()
	{return Prod_client;}
	public void setProd_cliente(String Prod_client)
	{this.Prod_client =Prod_client;}
	

}
