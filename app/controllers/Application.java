package controllers;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;

import laixi.DeptPositionMember;
import laixi.Member;
import laixi.Positions;

import com.hxrainbow.hxbos.metadb.orm.HxQuery;
import com.hxrainbow.hxbos.metadb.orm.HxSession;
import com.hxrainbow.hxbos.metadb.orm.HxSessionFactory;
import com.hxrainbow.hxbos.metadb.orm.cfg.HxConfig;
import com.hxrainbow.hxbos.metadb.orm.mdb.MDBAttribute;
import com.hxrainbow.hxbos.metadb.orm.mdb.MDBEntity;
import com.hxrainbow.hxbos.metadb.orm.transaction.HxTransaction;

import play.mvc.*;

public class Application extends Controller {

    public static void index() {
        render();
    }
    
    public static void test() {
        redirect("http://www.baidu.com",true);
    }
    
    public static void add(){
    	HxSessionFactory sessionFactory = HxConfig.getSessionFactory();
    	Member m = new Member();
		m.setAdcUserId(1);
		m.setApiSession("dddd");
		m.setCheckTime(new Date());
		m.setCreateTime(new Date());
		m.setDefOrg(1);
		m.setHeadPic("dddd");
		m.setId(2);
		m.setJsyEcname("dddd");
		m.setJsyUserId(1);
		m.setLoginName("admin");
		m.setName("admin");
		m.setPassword("c");
		m.setPortalSession("cddd");
		m.setSex(1);
		m.setSpell("cddd");
		m.setUpdateTime(new Date());
		HxSession session = sessionFactory.getCurrentSession();
		HxTransaction tran = session.getTransaction();
		try {
			tran.begin();
			session.save(m);
			m.setId(5);
			session.save(m);
			m.setId(3);
			session.save(m);
			m.setId(4);
			session.save(m);
			tran.commit();
		} catch (Exception e) {
			tran.rollback();
		} finally {
			session.close();

		}
    }
    
    public static void del(){
    	HxSessionFactory sessionFactory = HxConfig.getSessionFactory();
    	HxSession session = sessionFactory.getCurrentSession();
		Member m = new Member();
		m.setId(2);
		HxTransaction tran = session.getTransaction();
		try {
			tran.begin();
			session.delete(Member.class, 1);
			session.delete(Member.class, 2);
			tran.commit();
			session.delete(Member.class, 3);
			session.delete(Member.class, 4);
		} catch (Exception e) {
			e.printStackTrace();
			tran.rollback();
		} finally {
			session.close();

		}
    }
    
    public static void get(){
    	HxSessionFactory factory = HxConfig.getSessionFactory();
    	HxSession session = factory.getCurrentSession();
    	Positions e = session.find(Positions.class, 1);
		session.close();
		Set<Long> dpmKeySet = e.getDpmMap().keySet();
		//p<String, DeptPositionMember> md = e.getDpmMap();
		for (Long dpmrKey : dpmKeySet) {
			System.out.println("memberId:"
					+ e.getDpm(dpmrKey).getMemberId());
		}
    }
    
    public static void getSql(){
    	HxSessionFactory factory = HxConfig.getSessionFactory();
    	String ql="select o from position o";
		HxQuery q=factory.getCurrentSession().createQuery(ql);
		List<Object> list=q.getListResult();
		for(Object obj:list){
			Positions e=(Positions)obj;
			System.out.println(e.getPositionId()+" "+e.getPositionName());
		}
    }


}