package com.revature.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

import java.util.Date;


@Entity
@Component
@Table(name="image") // will not be saved to database, so there is no real table for it
public class Image {
	
	@Id
	@Column(name="date")
	private Date date;
	@Column(name="explanation", unique=true, nullable=false)
	private String explanation;
	@Column(name="hdurl", unique=true, nullable=false)
	private String hdurl;
	@Column(name="media_type", unique=true, nullable=false)
	private String mediaType;
	@Column(name="title", unique=true, nullable=false)
	private String title;
	@Column(name="url", unique=true, nullable=false)
	private String url;
	
	
	
	public Image() {
		super();
	}
	public Image(String explanation, String title, String mediaType, String url, String hdurl) {
		super();
		this.explanation = explanation;
		this.title = title;
		this.mediaType = mediaType;
		this.url = url;
		this.hdurl = hdurl;
	}
	public Image(Date date, String explanation, String title, String mediaType, String url, String hdurl) {
		super();
		this.date = date;
		this.explanation = explanation;
		this.title = title;
		this.mediaType = mediaType;
		this.url = url;
		this.hdurl = hdurl;
	}
	
	
	
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getExplanation() {
		return explanation;
	}
	public void setExplanation(String explanation) {
		this.explanation = explanation;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getMediaType() {
		return mediaType;
	}
	public void setMediaType(String mediaType) {
		this.mediaType = mediaType;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getHdurl() {
		return hdurl;
	}
	public void setHdurl(String hdurl) {
		this.hdurl = hdurl;
	}
	
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((date == null) ? 0 : date.hashCode());
		result = prime * result + ((explanation == null) ? 0 : explanation.hashCode());
		result = prime * result + ((hdurl == null) ? 0 : hdurl.hashCode());
		result = prime * result + ((mediaType == null) ? 0 : mediaType.hashCode());
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		result = prime * result + ((url == null) ? 0 : url.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Image other = (Image) obj;
		if (date == null) {
			if (other.date != null)
				return false;
		} else if (!date.equals(other.date))
			return false;
		if (explanation == null) {
			if (other.explanation != null)
				return false;
		} else if (!explanation.equals(other.explanation))
			return false;
		if (hdurl == null) {
			if (other.hdurl != null)
				return false;
		} else if (!hdurl.equals(other.hdurl))
			return false;
		if (mediaType == null) {
			if (other.mediaType != null)
				return false;
		} else if (!mediaType.equals(other.mediaType))
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		if (url == null) {
			if (other.url != null)
				return false;
		} else if (!url.equals(other.url))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Image [date=" + date + ", explanation=" + explanation + ", title=" + title + ", mediaType="
				+ mediaType + ", url=" + url + ", hdurl=" + hdurl + "]";
	}
}
