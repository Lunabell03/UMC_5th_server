package umc.study.service.MemberService;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import umc.study.domain.Member;
import umc.study.repository.MemberRepository;
import umc.study.web.dto.MemberRequestDTO;

@Service
@RequiredArgsConstructor
public class MemberCommandServiceImpl implements MemberCommandService {
    private final MemberRepository memberRepository;

    @Override
    public Member joinmember(MemberRequestDTO.JoinDTO request){
        return null;
    }
}
