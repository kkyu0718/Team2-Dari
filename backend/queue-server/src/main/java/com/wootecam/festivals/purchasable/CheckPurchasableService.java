package com.wootecam.festivals.purchasable;

import java.time.LocalDateTime;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class CheckPurchasableService {

    @Transactional
    public PurchasableResponse checkPurchasable(Long ticketId, Long loginMemberId, LocalDateTime now) {
        // Todo: Implement this method
        return new PurchasableResponse(false);
    }
}
