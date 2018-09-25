package org.vg.feign.proxy;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.vg.entity.CurrencyConversion;

//@FeignClient(name="currency-exchange-service", url="localhost:8001/currencyExchange")
//@FeignClient(name="currency-exchange-service")
//@RibbonClient(name="currency-exchange-service") //Not required if eureka is enabled
@FeignClient(name="api-gateway-server")
@RibbonClient(name="currency-exchange-service")
public interface CurrencyExchangeProxy {
	
		@GetMapping("currency-exchange-service/currencyExchange/from/{from}/to/{to}")
		public CurrencyConversion retriveExchangeValue(@PathVariable("from") String from,
				@PathVariable("to") String to);

}
