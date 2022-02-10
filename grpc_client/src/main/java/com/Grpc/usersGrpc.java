package com.Grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

import javax.annotation.processing.Generated;

/**
 */
@Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: users.proto")
public final class usersGrpc {

  private usersGrpc() {}

  public static final String SERVICE_NAME = "users";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.Grpc.Users.LogRequest,
      com.Grpc.Users.LogResponse> getEnterMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "enter",
      requestType = com.Grpc.Users.LogRequest.class,
      responseType = com.Grpc.Users.LogResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.Grpc.Users.LogRequest,
      com.Grpc.Users.LogResponse> getEnterMethod() {
    io.grpc.MethodDescriptor<com.Grpc.Users.LogRequest, com.Grpc.Users.LogResponse> getEnterMethod;
    if ((getEnterMethod = usersGrpc.getEnterMethod) == null) {
      synchronized (usersGrpc.class) {
        if ((getEnterMethod = usersGrpc.getEnterMethod) == null) {
          usersGrpc.getEnterMethod = getEnterMethod = 
              io.grpc.MethodDescriptor.<com.Grpc.Users.LogRequest, com.Grpc.Users.LogResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "users", "enter"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.Grpc.Users.LogRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.Grpc.Users.LogResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new usersMethodDescriptorSupplier("enter"))
                  .build();
          }
        }
     }
     return getEnterMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static usersStub newStub(io.grpc.Channel channel) {
    return new usersStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static usersBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new usersBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static usersFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new usersFutureStub(channel);
  }

  /**
   */
  public static abstract class usersImplBase implements io.grpc.BindableService {

    /**
     */
    public void enter(com.Grpc.Users.LogRequest request,
        io.grpc.stub.StreamObserver<com.Grpc.Users.LogResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getEnterMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getEnterMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.Grpc.Users.LogRequest,
                com.Grpc.Users.LogResponse>(
                  this, METHODID_ENTER)))
          .build();
    }
  }

  /**
   */
  public static final class usersStub extends io.grpc.stub.AbstractStub<usersStub> {
    private usersStub(io.grpc.Channel channel) {
      super(channel);
    }

    private usersStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected usersStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new usersStub(channel, callOptions);
    }

    /**
     */
    public void enter(com.Grpc.Users.LogRequest request,
        io.grpc.stub.StreamObserver<com.Grpc.Users.LogResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getEnterMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class usersBlockingStub extends io.grpc.stub.AbstractStub<usersBlockingStub> {
    private usersBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private usersBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected usersBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new usersBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.Grpc.Users.LogResponse enter(com.Grpc.Users.LogRequest request) {
      return blockingUnaryCall(
          getChannel(), getEnterMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class usersFutureStub extends io.grpc.stub.AbstractStub<usersFutureStub> {
    private usersFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private usersFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected usersFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new usersFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.Grpc.Users.LogResponse> enter(
        com.Grpc.Users.LogRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getEnterMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ENTER = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final usersImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(usersImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ENTER:
          serviceImpl.enter((com.Grpc.Users.LogRequest) request,
              (io.grpc.stub.StreamObserver<com.Grpc.Users.LogResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class usersBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    usersBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.Grpc.Users.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("users");
    }
  }

  private static final class usersFileDescriptorSupplier
      extends usersBaseDescriptorSupplier {
    usersFileDescriptorSupplier() {}
  }

  private static final class usersMethodDescriptorSupplier
      extends usersBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    usersMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (usersGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new usersFileDescriptorSupplier())
              .addMethod(getEnterMethod())
              .build();
        }
      }
    }
    return result;
  }
}
