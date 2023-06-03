package curg.ethseoul023.Controller;

import curg.ethseoul023.Domain.Approve;
import curg.ethseoul023.Dto.ApproveReturnDto;
import curg.ethseoul023.Service.ApproveService;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.util.Pair;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApproveController {

    private final ApproveService approveService;

    public ApproveController(ApproveService approveService) {
        this.approveService = approveService;
    }

    @PostMapping("/approve")
    public Pair<Boolean, String>signalApprove(Approve _approve) throws Exception {
        ApproveReturnDto returnDto = new ApproveReturnDto();
        return approveService.executeTransfer(_approve);
    }
}
