# API contract

Base path /api/v1. JSON envelope: {success:true,data:...,error:null}; errors use non-2xx and {success:false,data:null,error:{code,message}}.

GET products and products/{id}: public catalog/details. POST auth/register and auth/login: public buyer/seller auth. GET auth/me: signed in. GET/POST cart and DELETE cart/{id}: buyer. POST orders and GET orders: buyer. POST reviews: buyer with purchased item. GET/POST seller/products, DELETE seller/products/{id}, GET seller/orders: seller. GET admin: admin. POST chat: session-limited FAQ. GET health: database health.
