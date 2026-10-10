package com.sneha.snehamart.service;
/** Swappable server-side provider for product-domain chat replies. */
public interface ChatProvider {String getReply(String userMessage,String context) throws Exception;}
