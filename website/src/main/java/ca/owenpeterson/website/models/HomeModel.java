package ca.owenpeterson.website.models;

import java.io.Serializable;
import java.time.LocalDateTime;

public class HomeModel implements Serializable
{
	private static final long serialVersionUID = 6856522168779378593L;	
	private LocalDateTime date;

	public LocalDateTime getDate() 
	{
		return date;
	}

	public void setDate(LocalDateTime date) 
	{
		this.date = date;
	}
}
