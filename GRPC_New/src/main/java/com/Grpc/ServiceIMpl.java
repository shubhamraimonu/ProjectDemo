package com.Grpc;

import com.Grpc.Users.LogRequest;
import com.Grpc.Users.LogResponse;
import com.Grpc.usersGrpc.usersImplBase;

import io.grpc.stub.StreamObserver;

public class ServiceIMpl  extends usersImplBase {

	@Override
	public void enter(LogRequest request, StreamObserver<LogResponse> responseObserver) {
		// TODO Auto-generated method stub
		//super.enter(request, responseObserver);

		  String username=request.getName();
		  String passString=request.getPass();
		  LogResponse.Builder response=LogResponse.newBuilder();
		  
		  response.setCode("200").setMes(" setting Success set");
		  responseObserver.onNext(response.build()); 
		  responseObserver.onCompleted(); }
		 
		
		

	
	  /*@Override public void enter(in request, StreamObserver<out> responseObserver)
	  { // TODO Auto-generated method stub super.enter(request, responseObserver);
	  */

}
