package com.Grpc;

import java.io.IOException;

import com.Grpc.usersGrpc.usersImplBase;

import io.grpc.Server;
import io.grpc.ServerBuilder;

public class GRPC_Server {

	
	
	
	public static void main(String[] args) throws IOException, InterruptedException {
		
		Server server=ServerBuilder.forPort(9895).addService(new ServiceIMpl()).build();
		server.start();
		System.out.println("server started");
		
		server.awaitTermination();
	}
	
}
