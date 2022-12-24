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
public class LowGasSafeMathEchidnaTest extends Contract {
    public static final String BINARY = "608060405234801561001057600080fd5b506102b5806100206000396000f3fe608060405234801561001057600080fd5b50600436106100575760003560e01c80630f9350001461005c5780630fe48c5c146100815780636d886fae146100a45780639239e777146100c7578063bd78b20d146100ea575b600080fd5b61007f6004803603604081101561007257600080fd5b508035906020013561010d565b005b61007f6004803603604081101561009757600080fd5b5080359060200135610141565b61007f600480360360408110156100ba57600080fd5b5080359060200135610180565b61007f600480360360408110156100dd57600080fd5b50803590602001356101a3565b61007f6004803603604081101561010057600080fd5b50803590602001356101d6565b60006101198383610209565b9050818301811461012657fe5b8281101580156101365750818110155b61013c57fe5b505050565b600061014d838361021f565b9050818302811461015a57fe5b821580610165575081155b80610136575082811015801561013657508181101561013c57fe5b600061018c8383610243565b9050818303811461019957fe5b8281111561013c57fe5b60006101af8383610253565b905081830181146101bc57fe5b600082126101cd5782811215610136565b82811261013c57fe5b60006101e28383610269565b905081830381146101ef57fe5b600082126102005782811315610136565b82811361013c57fe5b8082018281101561021957600080fd5b92915050565b600082158061023a5750508181028183828161023757fe5b04145b61021957600080fd5b8082038281111561021957600080fd5b8181018281121560008312151461021957600080fd5b8082038281131560008312151461021957600080fdfea2646970667358221220a3e0a533eca7d9aae23a4cb78322666901e9e2176d4b7639471f4210eba1db0664736f6c63430007060033";

    public static final String FUNC_CHECKADD = "checkAdd";

    public static final String FUNC_CHECKADDI = "checkAddi";

    public static final String FUNC_CHECKMUL = "checkMul";

    public static final String FUNC_CHECKSUB = "checkSub";

    public static final String FUNC_CHECKSUBI = "checkSubi";

    @Deprecated
    protected LowGasSafeMathEchidnaTest(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    protected LowGasSafeMathEchidnaTest(String contractAddress, Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, credentials, contractGasProvider);
    }

    @Deprecated
    protected LowGasSafeMathEchidnaTest(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    protected LowGasSafeMathEchidnaTest(String contractAddress, Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, transactionManager, contractGasProvider);
    }

    @Deprecated
    public static LowGasSafeMathEchidnaTest load(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        return new LowGasSafeMathEchidnaTest(contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    @Deprecated
    public static LowGasSafeMathEchidnaTest load(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return new LowGasSafeMathEchidnaTest(contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    public static LowGasSafeMathEchidnaTest load(String contractAddress, Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider) {
        return new LowGasSafeMathEchidnaTest(contractAddress, web3j, credentials, contractGasProvider);
    }

    public static LowGasSafeMathEchidnaTest load(String contractAddress, Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        return new LowGasSafeMathEchidnaTest(contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public static RemoteCall<LowGasSafeMathEchidnaTest> deploy(Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider) {
        return deployRemoteCall(LowGasSafeMathEchidnaTest.class, web3j, credentials, contractGasProvider, BINARY, "");
    }

    @Deprecated
    public static RemoteCall<LowGasSafeMathEchidnaTest> deploy(Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        return deployRemoteCall(LowGasSafeMathEchidnaTest.class, web3j, credentials, gasPrice, gasLimit, BINARY, "");
    }

    public static RemoteCall<LowGasSafeMathEchidnaTest> deploy(Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        return deployRemoteCall(LowGasSafeMathEchidnaTest.class, web3j, transactionManager, contractGasProvider, BINARY, "");
    }

    @Deprecated
    public static RemoteCall<LowGasSafeMathEchidnaTest> deploy(Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return deployRemoteCall(LowGasSafeMathEchidnaTest.class, web3j, transactionManager, gasPrice, gasLimit, BINARY, "");
    }
}
