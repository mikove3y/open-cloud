package com.opencloud.api.gateway.fallback;

import com.opencloud.common.constants.ResultEnum;
import com.opencloud.common.model.ResultBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

/**
 * 响应超时熔断处理器
 * @author liuyadu
 */
@RestController
public class FallbackController {

    @RequestMapping("/fallback")
    public Mono<ResultBody> fallback() {
        return Mono.just(ResultBody.failed(ResultEnum.GATEWAY_TIMEOUT.getCode(), "访问超时，请稍后再试!"));
    }
}
