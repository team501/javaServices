//package com.springboot.jpa.postgres.rest.ResponseType;
//
//import java.io.Serializable;
//import com.fasterxml.jackson.annotation.JsonProperty;
//import com.fasterxml.jackson.annotation.JsonUnwrapped;
//import com.fasterxml.jackson.core.JsonGenerator;
//import com.fasterxml.jackson.databind.JsonSerializer;
//import com.fasterxml.jackson.databind.ObjectMapper;
//import com.fasterxml.jackson.databind.SerializationFeature;
//import com.fasterxml.jackson.databind.SerializerProvider;
//import com.fasterxml.jackson.databind.annotation.JsonSerialize;
//
//public class ResponseType<T> implements Serializable{
//
//	private static final long serialVersionUID = -599286126790091163L;
//	
//	private String returnMessage;
//    private int returnCode;
//    private long timeTook;
//    private T data;
//    private String server;
//}
