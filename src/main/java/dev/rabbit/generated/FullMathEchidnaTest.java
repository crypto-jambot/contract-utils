package dev.rabbit.generated;

import java.math.BigInteger;
import org.web3j.crypto.Credentials;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.core.RemoteCall;
import org.web3j.tx.Contract;
import org.web3j.tx.TransactionManager;
import org.web3j.tx.gas.ContractGasProvider;

/**
 * <p>Auto generated code.
 * <p><strong>Do not modify!</strong>
 * <p>Please use the <a href="https://docs.web3j.io/command_line.html">web3j command line tools</a>,
 * or the org.web3j.codegen.SolidityFunctionWrapperGenerator in the 
 * <a href="https://github.com/web3j/web3j/tree/master/codegen">codegen module</a> to update.
 *
 * <p>Generated with web3j version 4.9.4.
 */
@SuppressWarnings("rawtypes")
public class FullMathEchidnaTest extends Contract {
    public static final String BINARY = "608060405234801561001057600080fd5b50610349806100206000396000f3fe608060405234801561001057600080fd5b50600436106100415760003560e01c8063695363a31461004657806379eee48714610071578063bf08c3911461009a575b600080fd5b61006f6004803603606081101561005c57600080fd5b50803590602081013590604001356100c3565b005b61006f6004803603606081101561008757600080fd5b5080359060208101359060400135610122565b61006f600480360360608110156100b057600080fd5b50803590602081013590604001356101ad565b600081116100d057600080fd5b60006100dd848484610229565b905060006100ec858585610264565b9050600083806100f857fe5b85870911156101125780820360011461010d57fe5b61011b565b80821461011b57fe5b5050505050565b6000811161012f57600080fd5b600061013c848484610229565b9050831580610149575082155b1561015c57801561015657fe5b506101a8565b6000610169828486610264565b90506000610178838588610264565b90508582101561018457fe5b8481101561018e57fe5b838683031061019957fe5b83858203106101a457fe5b5050505b505050565b600081116101ba57600080fd5b60006101c7848484610264565b90508315806101d4575082155b156101e157801561015657fe5b60006101ee828486610264565b905060006101fd838588610264565b90508582111561020957fe5b8481111561021357fe5b838287031061021e57fe5b83818603106101a457fe5b6000610236848484610264565b90506000828061024257fe5b848609111561025d57600019811061025957600080fd5b6001015b9392505050565b600080806000198587098686029250828110908390030390508061029a576000841161028f57600080fd5b50829004905061025d565b8084116102a657600080fd5b6000848688096000868103871696879004966002600389028118808a02820302808a02820302808a02820302808a02820302808a02820302808a0290910302918190038190046001018684119095039490940291909403929092049190911791909102915050939250505056fea2646970667358221220d39ccd4379b53c1be82e304a1edd003fcfc542c60576afc64a095a9099824eb764736f6c63430007060033";

    public static final String FUNC_CHECKMULDIV = "checkMulDiv";

    public static final String FUNC_CHECKMULDIVROUNDING = "checkMulDivRounding";

    public static final String FUNC_CHECKMULDIVROUNDINGUP = "checkMulDivRoundingUp";

    @Deprecated
    protected FullMathEchidnaTest(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    protected FullMathEchidnaTest(String contractAddress, Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, credentials, contractGasProvider);
    }

    @Deprecated
    protected FullMathEchidnaTest(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    protected FullMathEchidnaTest(String contractAddress, Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, transactionManager, contractGasProvider);
    }

    @Deprecated
    public static FullMathEchidnaTest load(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        return new FullMathEchidnaTest(contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    @Deprecated
    public static FullMathEchidnaTest load(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return new FullMathEchidnaTest(contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    public static FullMathEchidnaTest load(String contractAddress, Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider) {
        return new FullMathEchidnaTest(contractAddress, web3j, credentials, contractGasProvider);
    }

    public static FullMathEchidnaTest load(String contractAddress, Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        return new FullMathEchidnaTest(contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public static RemoteCall<FullMathEchidnaTest> deploy(Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider) {
        return deployRemoteCall(FullMathEchidnaTest.class, web3j, credentials, contractGasProvider, BINARY, "");
    }

    @Deprecated
    public static RemoteCall<FullMathEchidnaTest> deploy(Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        return deployRemoteCall(FullMathEchidnaTest.class, web3j, credentials, gasPrice, gasLimit, BINARY, "");
    }

    public static RemoteCall<FullMathEchidnaTest> deploy(Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        return deployRemoteCall(FullMathEchidnaTest.class, web3j, transactionManager, contractGasProvider, BINARY, "");
    }

    @Deprecated
    public static RemoteCall<FullMathEchidnaTest> deploy(Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return deployRemoteCall(FullMathEchidnaTest.class, web3j, transactionManager, gasPrice, gasLimit, BINARY, "");
    }
}
