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
public class TickEchidnaTest extends Contract {
    public static final String BINARY = "608060405234801561001057600080fd5b506101ce806100206000396000f3fe608060405234801561001057600080fd5b506004361061002b5760003560e01c8063858027e514610030575b600080fd5b6100506004803603602081101561004657600080fd5b503560020b610052565b005b620d89e8600282900b131561006657600080fd5b60008160020b1361007657600080fd5b600081600281900b620d89e7198161008a57fe5b05029050600082600281900b620d89e8816100a157fe5b0502905060006100b08461012e565b90508260000360020b8260020b146100c457fe5b60008260020b136100d157fe5b8360020b83830360020b816100e257fe5b0760020b156100ed57fe5b60008460020b84840360020b8161010057fe5b0560020b60010190506001600160801b03801681836001600160801b031602111561012757fe5b5050505050565b60008082600281900b620d89e7198161014357fe5b05029050600083600281900b620d89e88161015a57fe5b0502905060008460020b83830360020b8161017157fe5b0560010190508062ffffff166001600160801b0380168161018e57fe5b049594505050505056fea26469706673582212204298fba81f695844fd8fce119d9a998c513f0cfc94d3e90a086d01923c48508464736f6c63430007060033";

    public static final String FUNC_CHECKTICKSPACINGTOPARAMETERSINVARIANTS = "checkTickSpacingToParametersInvariants";

    @Deprecated
    protected TickEchidnaTest(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    protected TickEchidnaTest(String contractAddress, Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, credentials, contractGasProvider);
    }

    @Deprecated
    protected TickEchidnaTest(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    protected TickEchidnaTest(String contractAddress, Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, transactionManager, contractGasProvider);
    }

    @Deprecated
    public static TickEchidnaTest load(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        return new TickEchidnaTest(contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    @Deprecated
    public static TickEchidnaTest load(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return new TickEchidnaTest(contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    public static TickEchidnaTest load(String contractAddress, Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider) {
        return new TickEchidnaTest(contractAddress, web3j, credentials, contractGasProvider);
    }

    public static TickEchidnaTest load(String contractAddress, Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        return new TickEchidnaTest(contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public static RemoteCall<TickEchidnaTest> deploy(Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider) {
        return deployRemoteCall(TickEchidnaTest.class, web3j, credentials, contractGasProvider, BINARY, "");
    }

    @Deprecated
    public static RemoteCall<TickEchidnaTest> deploy(Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        return deployRemoteCall(TickEchidnaTest.class, web3j, credentials, gasPrice, gasLimit, BINARY, "");
    }

    public static RemoteCall<TickEchidnaTest> deploy(Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        return deployRemoteCall(TickEchidnaTest.class, web3j, transactionManager, contractGasProvider, BINARY, "");
    }

    @Deprecated
    public static RemoteCall<TickEchidnaTest> deploy(Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return deployRemoteCall(TickEchidnaTest.class, web3j, transactionManager, gasPrice, gasLimit, BINARY, "");
    }
}
