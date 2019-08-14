package com.demo.model;

import lombok.Data;
import org.hibernate.annotations.Proxy;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author yuan
 */
@Entity
@Table(name="t_group")
@Data
public class TGroup {
	@Id
	private int id;

	@Column(name="group_name")
	private String groupName;
}
