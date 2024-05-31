package com.imooc.reader.service;

import com.imooc.reader.entity.Evaluation;
import com.imooc.reader.entity.Member;
import com.imooc.reader.entity.MemberReadState;

public interface MemberService {
    public Member createMember(String username, String password, String nickname);

    public Member checkLogin(String username, String password);

    /**
     * 获取阅读状态
     * @param memberId
     * @param bookId
     * @return
     */
    public MemberReadState selectMemberReadState(Long memberId, Long bookId);

    public MemberReadState updateMemberReadState(Long memberId, Long bookId, Integer readState);

    public Evaluation evaluate(Long memberId, Long bookId, Integer score, String content);

    public Evaluation enjoy(Long evaluationId);
}
