package com.emergya.apps.exceptioncontrol;

import java.io.Serializable;

import org.springframework.util.StringUtils;

/**
 * Exception class for application Exception Control
 * 
 * @version 1.0
 * @author Salvador de la Vega
 * @author Eduardo Serrano
 */
public class ExceptionControl extends Exception implements Serializable {

	/**
	 * UID Serializacion
	 */
	private static final long serialVersionUID = 4005587910714894253L;
	
	/**
	 * Nivel interno del Error
	 */
	private String msg;
	
	/**
	 * Codigo del error
	 */
	private Integer codErr;
	
	/**
	 * Ticket del error que es la key para la internacionalización del mensaje mostrado al usuario
	 */
	private String tickect;
	
	/**
	 * Excepción original que causa el error
	 */
	private Exception exceptionOrigen;
	
	/**
	 * Constructor de la clase isdefeException
	 * @param excepctionOrigen Exception que origina la excepcion de Venezuelacert
	 * @param msg mensaje interno del error
	 * @param codErr codigo de Error interno asignado
	 * @param ticket codigo de ticket asociado al mensaje para mostrar al usuario
	 */
	public ExceptionControl(Exception excepctionOrigen, String msg, Integer codErr, String ticket) {
		this.exceptionOrigen = excepctionOrigen;
		this.msg = msg;
		this.codErr = codErr;
		this.tickect = ticket;
	}

	/**
	 * @return mensaje msg
	 */
	public String getMsg() {
		return msg;
	}

	/**
	 * @param msg el mensaje interno de error a establecer 
	 */
	public void setMsg(String msg) {
		this.msg = msg;
	}

	/**
	 * @return el codigo interno codErr
	 */
	public Integer getCodErr() {
		return codErr;
	}

	/**
	 * @param codErr el codigo interno de error a establecer
	 */
	public void setCodErr(Integer codErr) {
		this.codErr = codErr;
	}

	/**
	 * @return identificador de tickect
	 */
	public String getTickect() {
		return this.tickect;
	}

	/**
	 * @param tickect el identificador de ticket a establecer
	 */
	public void setTickect(String tickect) {
		this.tickect = tickect;
	}

	/**
	 * @return Excepcion de Origen exceptionOrigen
	 */
	public Exception getExceptionOrigen() {
		return exceptionOrigen;
	}

	/**
	 * @param exceptionOrigen Excepcion de Origen a establecer
	 */
	public void setExceptionOrigen(Exception exceptionOrigen) {
		this.exceptionOrigen = exceptionOrigen;
	}
	/**
	 * 
	 */
	public String toString(){
		String res = new String();
		if(msg != null)
			res += msg;
		if(codErr != null)
			res += StringUtils.hasLength(res) ? " - " + codErr : codErr;
		
		if(exceptionOrigen != null)
			res += StringUtils.hasLength(res) ? "\n" + exceptionOrigen : exceptionOrigen;
		
		return res;
	}
	
}
