//import static org.hamcrest.CoreMatchers.equalTo;
//import static org.junit.Assert.assertNotNull;
//import static org.junit.Assert.assertThat;
//
//import java.io.IOException;
//import java.net.InetSocketAddress;
//import java.net.URI;
//import java.net.URISyntaxException;
//import java.nio.charset.CharacterCodingException;
//import java.nio.charset.Charset;
//import java.util.concurrent.BlockingQueue;
//import java.util.concurrent.LinkedBlockingQueue;
//import java.util.concurrent.TimeUnit;
//
//import org.apache.asyncweb.common.DefaultHttpRequest;
//import org.apache.asyncweb.common.DefaultHttpResponse;
//import org.apache.asyncweb.common.HttpMethod;
//import org.apache.asyncweb.common.HttpRequest;
//import org.apache.asyncweb.common.HttpResponse;
//import org.apache.asyncweb.common.HttpResponseStatus;
//import org.apache.asyncweb.common.HttpVersion;
////import org.apache.asyncweb.common.codec.HttpCodecFactory;
//import org.apache.mina.common.IoBufferWrapper;
//import org.apache.mina.common.IoHandler;
//import org.apache.mina.core.future.ConnectFuture;
//import org.apache.mina.core.service.IoHandlerAdapter;
//import org.apache.mina.core.session.IoSession;
//import org.apache.mina.filter.codec.ProtocolCodecFactory;
//import org.apache.mina.filter.codec.ProtocolCodecFilter;
//import org.apache.mina.filter.codec.ProtocolDecoder;
//import org.apache.mina.filter.codec.ProtocolEncoder;
//import org.apache.mina.transport.socket.nio.NioSocketAcceptor;
//import org.apache.mina.transport.socket.nio.NioSocketConnector;
//import org.junit.After;
//import org.junit.Before;
//import org.junit.Test;
//
//public class TestServer {
//
//	class ServerHandler extends IoHandlerAdapter {
//		@Override
//		public void messageReceived(IoSession session, Object message) throws Exception {
//			HttpRequest request = (HttpRequest) message;
//			URI uri = request.getRequestUri();
//			DefaultHttpResponse response = new DefaultHttpResponse();
//
//			String requestMessage = uri.toString();
//			response.setStatus(HttpResponseStatus.OK);
//			response.setContent(IoBufferWrapper.wrap(requestMessage.getBytes()));
//			response.normalize(request);
//
//			session.write(response);
//		}
//	}
//
//	class ClientHandler extends IoHandlerAdapter {
//		BlockingQueue<Object> received = new LinkedBlockingQueue<Object>();
//
//		@Override
//		public void messageReceived(IoSession session, Object message) throws Exception {
//			received.put(message);
//		}
//	}
//
//	private NioSocketAcceptor acceptor;
//
//	private int port;
//
//	@Before
//	public void init() throws IOException {
//		acceptor = new NioSocketAcceptor();
//		acceptor.getFilterChain().addLast("httpCodec", new ProtocolCodecFilter(new ProtocolCodecFactory() {
//			
//			@Override
//			public ProtocolEncoder getEncoder(org.apache.mina.common.IoSession arg0)
//					throws Exception {
//				// TODO Auto-generated method stub
//				return null;
//			}
//			
//			@Override
//			public ProtocolDecoder getDecoder(org.apache.mina.common.IoSession arg0)
//					throws Exception {
//				// TODO Auto-generated method stub
//				return null;
//			}
//		}));
//		acceptor.setHandler((IoHandler) new ServerHandler());
//		acceptor.setDefaultLocalAddress(new InetSocketAddress(0));
//		acceptor.bind();
//		port = acceptor.getLocalAddress().getPort();
//	}
//
//	@After
//	public void destroy() {
//		acceptor.unbind();
//		acceptor.dispose();
//	}
//
//	@Test
//	public void testConnection() throws InterruptedException, URISyntaxException, CharacterCodingException {
//		NioSocketConnector connector = new NioSocketConnector();
//		try {
//			connector.getFilterChain().addLast("httpCodec", new ProtocolCodecFilter(new ProtocolCodecFactory() {
//				
//				@Override
//				public ProtocolEncoder getEncoder(org.apache.mina.common.IoSession arg0)
//						throws Exception {
//					// TODO Auto-generated method stub
//					return null;
//				}
//				
//				@Override
//				public ProtocolDecoder getDecoder(org.apache.mina.common.IoSession arg0)
//						throws Exception {
//					// TODO Auto-generated method stub
//					return null;
//				}
//			}));
//			ClientHandler handler = new ClientHandler();
//			connector.setHandler((IoHandler) handler);
//			ConnectFuture connectFuture = (ConnectFuture) connector.connect(new InetSocketAddress("127.0.0.1", port))
//					.awaitUninterruptibly();
//			IoSession session = connectFuture.getSession();
//			assertNotNull(session);
//
//			try {
//				doGetRequest(session, "hi");
//				doGetRequest(session, "");
//				doGetRequest(session, "logout");
//			} finally {
//			}
//		} finally {
//			connector.dispose();
//		}
//	}
//
//	private void doGetRequest(IoSession session, String uri) throws URISyntaxException, InterruptedException,
//			CharacterCodingException {
//		DefaultHttpRequest request = new DefaultHttpRequest();
//		request.setRequestUri(new URI("http://example.com/" + uri));
//		request.setMethod(HttpMethod.GET);
//		request.setProtocolVersion(HttpVersion.HTTP_1_1);
//		request.setKeepAlive(true);
//		session.write(request);
//		HttpResponse response = (HttpResponse) ((ClientHandler) session.getHandler()).received.poll(5,
//				TimeUnit.SECONDS);
//		assertNotNull(response);
//		String responseString = response.getContent().getString(Charset.forName("UTF-8").newDecoder());
//		assertThat(responseString, equalTo("/" + uri));
//	}
//
//}
