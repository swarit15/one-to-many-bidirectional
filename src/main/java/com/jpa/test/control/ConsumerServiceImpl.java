package com.jpa.test.control;

import java.sql.Timestamp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ConsumerServiceImpl implements ConsumerService {

	@Autowired
	private ConsumerRepo consumerRepo;
	
	@Override
	public int saveConsumer(Consumer consumer) {
		ConsumerEntity consumerEntity = new ConsumerEntity();
		consumerEntity.setName(consumer.getName());
		MobileInfoEntity mobileEn = null;
		for(MobileInfo  mobile : consumer.getMobileInfo()) {
			mobileEn = new MobileInfoEntity();
			mobileEn.setMobileNum(mobile.getMobileNum());
			mobileEn.setCratedDate(new Timestamp(System.currentTimeMillis()));
			mobileEn.setConsumerEntity(consumerEntity);
			consumerEntity.getMobileInfo().add(mobileEn);
		}

		ConsumerEntity entity =consumerRepo.save(consumerEntity);
		return entity.getId().intValue();
	}

}
