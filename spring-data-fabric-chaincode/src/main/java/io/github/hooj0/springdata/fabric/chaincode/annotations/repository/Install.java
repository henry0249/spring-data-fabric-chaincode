package io.github.hooj0.springdata.fabric.chaincode.annotations.repository;

import org.springframework.core.annotation.AliasFor;
import org.springframework.data.annotation.QueryAnnotation;

import io.github.hooj0.springdata.fabric.chaincode.enums.ProposalType;

/**
 * 安装智能合约 Chaincode
 * @author hoojo
 * @createDate 2018年7月16日 下午5:16:01
 * @file Install.java
 * @package io.github.hooj0.springdata.fabric.chaincode.annotations
 * @project spring-data-fabric-chaincode
 * @blog http://hoojo.cnblogs.com
 * @email hoojo_@126.com
 * @version 1.0
 */
@Deploy
@Proposal(type = ProposalType.INSTALL)
@QueryAnnotation
public @interface Install {

	@AliasFor(annotation = Proposal.class)
	String value() default "";
}