package com.Grpc;

import com.Grpc.Users.LogRequest;
import com.Grpc.Users.LogResponse;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class GRpc_Client {
	
	public static void main(String[] args) {
		ManagedChannel channel=ManagedChannelBuilder.forAddress("localhost",9895).usePlaintext().build();
		
		usersGrpc.usersBlockingStub stub=usersGrpc.newBlockingStub(channel);
		LogRequest request=Users.LogRequest.newBuilder().setName("hello").setPass("yes").build();
		LogResponse response=stub.enter(request);
		System.out.println("response" + response.getMes());
		
	}

}
